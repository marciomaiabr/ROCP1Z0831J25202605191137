package br.com.pkgModuloExe;

import java.util.*;
import br.com.pkgModuloInterfaces.InterfaceX;
import br.com.pkgModuloLocator.ClassMMLocator;

public class ClassModuloExe {

    public static void main(String[] args) {
        List<InterfaceX> beans = ClassMMLocator.findAll();
        System.out.println("beans.size(): " + beans.size());
		beans.forEach(System.out::println);
    }

}
