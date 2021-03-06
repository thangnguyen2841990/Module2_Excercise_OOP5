package com.codegym;

public class CadresManagement {
    public static final int SIZE = 0;
    private Worker[] workers = new Worker[SIZE];
    private Engineer[] engineers = new Engineer[SIZE];
    private Staff[] staffs = new Staff[SIZE];

    public CadresManagement() {

    }

    public CadresManagement(Worker[] workers, Engineer[] engineers, Staff[] staffs) {
        this.workers = workers;
        this.engineers = engineers;
        this.staffs = staffs;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public Engineer[] getEngineers() {
        return engineers;
    }

    public void setEngineers(Engineer[] engineers) {
        this.engineers = engineers;
    }

    public Staff[] getStaffs() {
        return staffs;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }

    public void addnewCardes(int index, Worker newWorker) {
        Worker[] newWorkers = new Worker[workers.length + 1];
        for (int i = 0; i < newWorkers.length; i++) {
            if (i < index) {
                newWorkers[i] = workers[i];
            } else if (i == index) {
                newWorkers[i] = newWorker;
            } else {
                newWorkers[i] = workers[i - 1];
            }
        }
        this.workers = newWorkers;
    }

    public void addNewCardes(int index, Engineer newEngineer) {
        Engineer[] newEngineers = new Engineer[engineers.length + 1];
        for (int i = 0; i < newEngineers.length; i++) {
            if (i < index) {
                newEngineers[i] = engineers[i];
            } else if (i == index) {
                newEngineers[i] = newEngineer;
            } else {
                newEngineers[i] = engineers[i - 1];
            }
        }
        this.engineers = newEngineers;
    }

    public void addNewCardes(int index, Staff newStaff) {
        Staff[] newStaffs = new Staff[staffs.length + 1];
        for (int i = 0; i < newStaffs.length; i++) {
            if (i < index) {
                newStaffs[i] = staffs[i];
            } else if (i == index) {
                newStaffs[i] = newStaff;
            } else {
                newStaffs[i] = staffs[i - 1];
            }
        }
        this.staffs = newStaffs;
    }

    public void displayWorker() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }

    public void displayEngineer() {
        for (int i = 0; i < engineers.length; i++) {
            System.out.println(engineers[i]);
        }
    }

    public void displayStaff() {
        for (int i = 0; i < staffs.length; i++) {
            System.out.println(staffs[i]);
        }
    }

    public void findCardes(String name) {

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(name)) {
                System.out.println(workers[i]);
            } else if (engineers[i].getName().equals(name)) {
                System.out.println(engineers[i]);
            } else if (staffs[i].getName().equals(name)) {
                System.out.println(staffs[i]);
            } else {
                System.out.println("Kh??ng t??m th???y " + name);
            }

        }
    }
}
