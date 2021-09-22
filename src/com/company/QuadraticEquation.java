package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QuadraticEquation extends Remote {

    String equationSolution(double a, double b, double c) throws RemoteException;
}
