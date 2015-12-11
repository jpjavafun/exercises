package com.jpaisley.javabeanconfig.deps;

/**
 * Created by jpaisley on 10/11/15.
 */
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
