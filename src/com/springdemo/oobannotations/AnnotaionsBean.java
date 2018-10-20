package com.springdemo.oobannotations;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotaionsBean {

    @Autowired
    private SpellChecker spellchecker;

    public SpellChecker getSpellchecker() {
        return spellchecker;
    }

    public AnnotaionsBean() {
        System.out.println("Inside AnnotaionsBean default constructor");
    }


    public AnnotaionsBean(SpellChecker spellchecker) {
        this.spellchecker=spellchecker;
        System.out.println("Inside AnnotaionsBean parameterized constructor");
    }

    public void setSpellchecker(final SpellChecker spellchecker) {
        this.spellchecker = spellchecker;
        System.out.println("setSpellchecker has been called...");
    }

    public void spellCheck() {
        spellchecker.checkSpelling();
    }
}
