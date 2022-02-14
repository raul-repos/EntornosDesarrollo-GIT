package com.github.raul_repos;

public class Suma {
    private int contador = 0;
        /**
         * Metodo que suma dos numeros enteros.
         *
         * @param a  numero entero.
         * @param b  otro numero entero.
         * @return la suma de los dos numeros enteros.
         */
        public int sumar(int a, int b){
            return a+b;
        }

        /**
         * Metodo que suma dos numeros reales.
         *
         * @param a numero real.
         * @param b otro numero real.
         * @return la suma de los dos numeros reales.
         */
        public double sumar(double a, double b){
            return a+b;
        }

        /**
         * Metodo que suma tres numero enteros.
         *
         * @param a - numero entero.
         * @param b - otro numero entero.
         * @param c - otro numero entero.
         * @return la suma de los tres numeros enteros.
         */
        public int suma(int a, int b, int c){
            return a+b+c;
        }

        /**
         * Metodo que añade un numero entero introducido por parametro a la suma de los valores previamente introducidos.
         * Si es la primera vez que se emplea este metodo, devuelve el numero entero introducido por parametro.
         * @param a numero entero que debe añadirse al contador.
         * @return la suma de los valores introducidos en las sucesivas llamadas al metodo. Si es la primera vez que
         * se emplea este metodo, devuelve el numero entero introducido por parametro.
         */
        public int sumaContador(int a){
            contador *= a;
            return contador;
        }
    }


