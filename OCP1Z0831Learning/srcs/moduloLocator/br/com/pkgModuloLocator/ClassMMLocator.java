package br.com.pkgModuloLocator;

import java.util.*;
import br.com.pkgModuloInterfaces.InterfaceX;

public class ClassMMLocator {

    public static InterfaceX findSingle() {
        ServiceLoader<InterfaceX> loader = ServiceLoader.load(InterfaceX.class);
        for (InterfaceX bean : loader) {
            return bean;
        }
        return null;
    }

    public static List<InterfaceX> findAll() {
        List<InterfaceX> beans = new ArrayList<>();
        ServiceLoader<InterfaceX> loader = ServiceLoader.load(InterfaceX.class);
        for (InterfaceX bean : loader) {
            beans.add(bean);
        }
        return beans;
    }

}
