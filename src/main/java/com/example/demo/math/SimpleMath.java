package com.example.demo.math;

import com.example.demo.converter.NumberConverter;
import com.example.demo.exceptions.handler.UnsurpotedExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.example.demo.converter.NumberConverter.isNumeric;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;

    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;

    }
    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;

    }

    public Double media(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;

        }

    public Double raiz( Double number) {
        return Math.sqrt(number);
        }

        }
