package com.company;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static final String UNIQUE_BINDING_NAME = "server.equation";

    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(2732);

        QuadraticEquation quadraticEquation = (QuadraticEquation) registry.lookup(UNIQUE_BINDING_NAME);

        String multiplyResult = quadraticEquation.equationSolution(2,9,1);

        System.out.println(multiplyResult);
    }
}
