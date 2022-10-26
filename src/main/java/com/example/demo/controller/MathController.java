package com.example.demo.controller;

import com.example.demo.Greeting;
import com.example.demo.converter.NumberConverter;
import com.example.demo.exceptions.handler.UnsurpotedExceptionHandler;
import com.example.demo.math.SimpleMath;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import static com.example.demo.converter.NumberConverter.isNumeric;

@RestController()
public class MathController {

    SimpleMath math = new SimpleMath();

    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo

    ) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsurpotedExceptionHandler("Operação suporta apenas tipos numericos");
        }
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo

    ) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsurpotedExceptionHandler("Operação suporta apenas tipos numericos");
        }
        return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }
    @RequestMapping(value = "/multi/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo

    ) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsurpotedExceptionHandler("Operação suporta apenas tipos numericos");
        }
        return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo

    ) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsurpotedExceptionHandler("Operação suporta apenas tipos numericos");
        }
        return math.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }
    @RequestMapping(value = "/sqt/{number}", method = RequestMethod.GET)
    public Double raiz(
            @PathVariable(value = "number") String number


    ) throws Exception {

        if (!isNumeric(number))  {
            throw new UnsurpotedExceptionHandler("Operação suporta apenas tipos numericos");
        }
        return math.raiz(NumberConverter.convertToDouble(number));

    }





    }




