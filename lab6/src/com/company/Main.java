package com.company;

import com.company.catalog.CatalogFileLoader;
import com.company.catalog.CatalogLoader;
import com.company.catalog.CatalogStubLoader;
import com.company.catalog.ItemCatalog;
import com.company.exceptions.CatalogLoadException;
import com.company.exceptions.ItemAlreadyExistsException;
import com.company.models.FoodItem;
import com.company.sync.Bank;
import com.company.sync.BankThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        task1();

        System.out.println("Task 2");
        task2();

        System.out.println("Task 3");
        task3();
    }

    private static void task1()  {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();

        try {
            loader.load(catalog);
            catalog.addItem(catalog.findById(5));
        } catch (CatalogLoadException | ItemAlreadyExistsException ex) {
            ex.printStackTrace();
        }
    }

    private static void task2() {
        Bank bank = new Bank();
        Thread thread1 = new BankThread(bank, 100, 2000);
        thread1.setName("Thread-1");
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new BankThread(bank, 50, 300);
        thread2.setName("Thread-2");
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        System.out.println(String.format("Main thread end: %s", Thread.currentThread().getName()));

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void task3() {
        CatalogLoader loader = new CatalogFileLoader("data.txt");
        ItemCatalog catalog = new ItemCatalog();

        try {
            loader.load(catalog);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
        }

        System.out.println(catalog);
    }
}