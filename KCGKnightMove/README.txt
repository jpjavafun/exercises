The program is executed with the maven command:

mvn java:exec


My initial approach was to start with each key, recursively building
a combination of key presses, based on the constraints outlined in the 
problem document. This, for me, seemed the most straightforward approach.

However when running this algorithm for large values of N (N > 16) the program
would take too long(15 minutes +). 
          
           
I had a look at possibly using a fork/join approach with the recursive task, but 
was seeing little improvement with my experiments. I decided that using cached data
to combine sequences was going to be the biggest saver on calculation time. To keep
it simple I divide the path length specified in two, run all possible combinations 
for path length/2 and at the same time I store a summary that holds data on each sequence
based on the start key. I then use all the sequences I've calculated and combine this
with the path summary data to complete my path count calculation for the full path length of
N. So for all path sequence ending in A with a vowel count of 1, I combine the summary data
for sequences starting with 'L' and 'H' (next keys), that have a vowel count of 1 or less. (2 would
make an invalid sequence).

Using this combination method, I used my initial approach to validate the figures I was 
generating. And in fact, I've left this as my algorithm for values of N>=10.Given a little more time 
I would have explored combining sequences in a more dynamic manner rather than splitting N.

It was a fun exercise, I hope I was on the right track!

thanks
        
