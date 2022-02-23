package com.github.raul_repos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    double a = 4.5;
    double b = 2.5;
    double c = 0;
    int d = 4;
    int e = 2;
    int f = -1;

    Division div = new Division();

    @BeforeEach
            void avisar() {
        System.out.println("------------- Nuevo Test -------------");
    }

    @Test
    void intDividir() {
        // return de valor esperado
        System.out.println("Test0");
        assertEquals(1.8, div.dividir(a, b));
        // Para el segundo parámetro = 0
        System.out.println("Test1");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            div.dividir(a, c);
        });
        // Para el primer parámetro = 0
        System.out.println("Test2");
        Exception newException = assertThrows(IllegalArgumentException.class, () -> {
            div.dividir(c, b);
        });
    }

    @Test
    void doubleDividir() {
        // return de valor esperado
        assertEquals(2,div.dividir(d,e));
        System.out.println("Test3");
        // Para el segundo parámetro = 0
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            System.out.println("Test4");
            div.dividir(d,c);
        });
        // Para el primer parámetro = 0
        Exception newException = assertThrows(IllegalArgumentException.class, () -> {
            System.out.println("Test5");
            div.dividir(c,e);
        });
    }

    @Test
    void inverso() {
        // test para excepción por valor = 0
        Exception valor0 = assertThrows(IllegalArgumentException.class, () -> {
            System.out.println("Test6");
            div.inverso(c);
        });
        // test de valor esperado
        System.out.println("Test7");
        assertEquals(0.5,div.inverso(e));
    }

    @Test
    void raiz() {
        Exception numNegativo = assertThrows(IllegalArgumentException.class, () -> {
            System.out.println("Test8");
            div.raiz(f);
        });
        System.out.println("Test9");
        assertEquals(2, div.raiz(d));
    }
}