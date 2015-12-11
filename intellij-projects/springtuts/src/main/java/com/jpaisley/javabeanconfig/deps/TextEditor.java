package com.jpaisley.javabeanconfig.deps;

/**
 * Created by jpaisley on 10/11/15.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}