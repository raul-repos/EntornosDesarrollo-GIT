package com.github.raul_repos;
/**
 * Clase empleada para dividir numeros entre si.
 *
 * Estos numeros deben ser positivos.
 */

public class Division {
        /**
         * Metodo que divide un numero real por otro.
         *
         * El parametro <i>a</i> actua como dividendo, siendo el parametro <i>b</i> el que actua como divisor. Ninguno de los dos puede ser 0.
         *
         * @param a numero real dividendo (numero que se divide).
         * @param b numero real divisor (numero por el que se divide).
         * @return numero real resultante de la division del parametro <i>a</i> entre el parametro. <i>b</i>
         * @throws IllegalArgumentException uno de los parametros introducidos es cero (0).
         */
        public double dividir(double a, double b) {
                if (a == 0 || b == 0){
                        throw new IllegalArgumentException("Uno de los parametros introducido es cero (0)");
                }
           return a/b;
        }

        /**
         * Metodo que divide un numero entero por otro.
         *
         * El parametro <i>a</i> actua como dividendo, siendo el parametro <i>b</i> el que actua como divisor. Ninguno de los dos puede ser 0.
         * <ul>
         *     <li>En caso en el que el resto sea distinto a 0, no se admitiran decimales, rendondeando a la unidad.</li>
         *     <li>En caso de que la division de un numero periodico, no se admitiran decimales, redondeando a la unidad.</li>
         * </ul>
         *
         * @param a numero real dividendo (numero que se divide).
         * @param b numero real divisor (numero por el que se divide).
         * @return numero real resultante de la division del parametro <i>a</i> entre el parametro <i>b</i>.
         * @throws IllegalArgumentException uno de los parametros introducidos es cero (0).
         */
        public double dividir(int a, int b){
                if (a == 0 || b == 0){
                        throw new IllegalArgumentException("Uno de los parametros introducido es cero (0)");
                }
                return Math.round(a/b);
        }

        /**
         * Metodo que devuelve el inverso de un numero real.
         * @param a numero real.
         * @return devuelve el inverso del numero real.
         * @throws IllegalArgumentException el parametro introducido no puede ser cero (0).
         */
        public double inverso(double a){
                if (a == 0){
                        throw new IllegalArgumentException("El parametro introducido no puede ser cero");
                }
                return 1/a;
        }

        /**
         * Devuelve la raiz cuadrada de un numero entero positivo dado.
         *
         * @param a numero entero.
         * @return la raiz cuadrada de un numero entero.
         * @throws IllegalArgumentException el parametro introducido debe ser un numero positivo.
         */
        public double raiz(int a){
                if (a < 0) {
                        throw new IllegalArgumentException("El parametro introducido debe ser un numero positivo");
                }
                return Math.sqrt(a);
        }
    }


