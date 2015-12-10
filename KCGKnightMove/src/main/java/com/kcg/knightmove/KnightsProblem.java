/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcg.knightmove;

/**
 *
 * @author jpaisley
 */
import java.util.*;

public class KnightsProblem {

    private KeyPad keys;
    private List<String> sequences;
    private long numberOfSequences;
    private Map<Character, SequenceCount> sequencesEnd;
    private ArrayList<SequencePart> sequencesStart;
    private int pathLengthFinal;
    private int pathLengthSplit;

    KnightsProblem() {

        this.keys = new KeyPad();
        this.sequences = new ArrayList<>();
        this.numberOfSequences = 0;
        this.sequencesEnd = new HashMap<>();
        this.sequencesStart = new ArrayList<>();
        this.pathLengthFinal = 0;
        this.pathLengthSplit = 0;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    /*  Intro - my inital implementation involved starting from each
        key, recursively exploring next moves for given the current key.I rejected
        moves that matched the current key.
            
        The path count would be incremented if the path length was met.
        The path would end if the vowel count reached three. This for me seemed 
        a straightforward programming of the constraints specified in the KnightsMove
        document.
            
        However, when I ran this algorithm for length>16 the program took to long to 
        arrive at an answer (5 minutes+).
            
        I had a look at possibly using a fork/join approach with the recursive task, but 
        I settled on caching on dividing the path search and caching the results. So for leangth=32,
        I explore all the possible path sequences for length = 16, storing data for each path I discover
        such as starting key, end key and vowel count. I also store for each start key a summary of all
        the sequences discovered. I then I cycle through the discovered paths of length 16 using the end key
        to combine with my key path summary data.
            
        As I introduced the combination method for this program I maintained the initial approach
        for testing.
        
      */
        
        KnightsProblem kp = new KnightsProblem();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter path length: ");

        // get their input as a String
        kp.pathLengthFinal = scanner.nextInt();
                
        
        if(kp.pathLengthFinal > 10){
        
            System.out.println("Using long path solution");
        

            if(kp.pathLengthFinal%2==0){

                kp.pathLengthSplit = kp.pathLengthFinal/2;
            }else{

                kp.pathLengthSplit = (kp.pathLengthFinal/2)+1;
            }


            for (Key k : kp.keys.keys) {

                kp.sequencesEnd.put(k.getName(), new SequenceCount());

            }

           
            for (Key k : kp.keys.keys) {
                    kp.makeMoveLongPath(k.getName(), 0, ' ', 0, k.getName(), new StringBuffer());
            } 

            for (SequencePart sp : kp.sequencesStart) {

                Key myKey = kp.keys.getKey(sp.getEndKey());
                for (char c : myKey.getMoves()) {
                   int totals =0;
                   if (c != sp.getLastKey()) {         
                        SequenceCount tp = kp.sequencesEnd.get(c);
                        totals+= tp.getTotalCounts(sp.getNoOfVowels(),sp.getEndKey());
                   }
                    kp.numberOfSequences +=totals;

                }

            }
            
        } else{

                System.out.println("Using short path solution");
                for (Key k : kp.keys.keys) {
                    kp.makeMoveShortPath(k.getName(), 0, ' ', 0);
                }

        }
      
 
       

        System.out.println("Number of sequences:" + kp.numberOfSequences);

    }

    public void makeMoveShortPath(char startKey, int pathLength, char lastKey, int vowelCount) {

        pathLength++;

        Key myKey = keys.getKey(startKey);

        if (myKey.isVowelKey()) {
            vowelCount++;
        }
        if (vowelCount >= 3) {
            return;
        }

        if (pathLength == pathLengthFinal) {
            numberOfSequences++;
            return;
        }

        for (char c : myKey.getMoves()) {
            if (c != lastKey) {
                makeMoveShortPath(c, pathLength, startKey, vowelCount);
           }
       }

    }


    public void makeMoveLongPath(char startKey, int pathLength, char lastKey, int vowelCount, char initKey, StringBuffer sb) {

        pathLength++;
        sb.append(startKey);

        Key myKey = keys.getKey(startKey);

        if (myKey.isVowelKey()) {
            vowelCount++;
        }
        if (vowelCount >= 3) {
            return;
        }

        if (pathLength == this.pathLengthFinal/2) {
            sequencesEnd.get(initKey).incrementCount(vowelCount, sb.toString().charAt(1));
        }
        
        if (pathLength == this.pathLengthSplit) {
            SequencePart sp = new SequencePart(pathLength, initKey, startKey, vowelCount, lastKey);
            sequencesStart.add(sp);
            return;
        }

        for (char c : myKey.getMoves()) {
           if (c != lastKey) {
                makeMoveLongPath(c, pathLength, startKey, vowelCount, initKey, new StringBuffer(sb));
           }
        }

    }
    
    
}
