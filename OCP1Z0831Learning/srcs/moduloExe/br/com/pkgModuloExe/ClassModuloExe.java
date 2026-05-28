package br.com.pkgModuloExe;

import java.util.*;
import br.com.pkgModuloInterfaces.InterfaceX;
import br.com.pkgModuloLocator.ClassMMLocator;

public class ClassModuloExe {

    public static void main(String[] args) {
        InterfaceX bean = ClassMMLocator.findSingle();
        System.out.println("bean: " + bean);

        List<InterfaceX> beans = ClassMMLocator.findAll();
        System.out.println("beans: " + beans.size());
    }

}
