package Controlar;

import static java.lang.System.out;
import static java.lang.System.in;

import java.io.Serializable;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Classe que abstrai a utiliza&ccedil;&atilde;o da classe Scanner, escondendo todos os
 * problemas relacionados com excep&ccedil;&otilde;es, e que oferece m&eacute;todos simples e
 * robustos para a leitura de valores de tipos simples e String.
 *
 * &Eacute; uma classe de servi&ccedil;os, como Math e outras de Java, pelo que devem ser
 * usados os m&eacute;todos de classe implementados.
 *
 * Utiliz&aacute;vel em BlueJ, NetBeans, CodeBlocks ou Eclipse.
 *
 * Utiliza&ccedil;&atilde;o t&iacute;pica:  int x = Controlar.Input.lerInt();
 *                     String nome = Controlar.Input.lerString();
 *
 * @author F. M&aacute;rio Martins
 * @version 1.0 (6/2006)
 */
public class Input implements InterfaceInput {

    /**
     * Métodos de Classe
     */

    public String lerString() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        String txt = "";
        while (!ok) {
            try {
                txt = input.nextLine();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Texto Invalido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        //input.close();
        return txt;
    }


    public int lerInt() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = input.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Inteiro Invalido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        //input.close();
        return i;
    }

    public double lerDouble() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        double d = 0.0;
        while (!ok) {
            try {
                d = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Valor real Invalido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        //input.close();
        return d;
    }

    public float lerFloat() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        float f = 0.0f;
        while (!ok) {
            try {
                f = input.nextFloat();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Valor real Invalido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        //input.close();
        return f;
    }

    public boolean lerBoolean() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        boolean b = false;
        while (!ok) {
            try {
                b = input.nextBoolean();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Booleano Invalido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        //input.close();
        return b;
    }

    public short lerShort() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        short s = 0;
        while (!ok) {
            try {
                s = input.nextShort();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Short Invalido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        //input.close();
        return s;
    }
}