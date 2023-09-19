package org.example.Drug;
import java. util.*;
/**
 * @date 2023/9/18 20:08
 */
public class Application {
    public static void main(String[] args) {
        DrugCreater creator=new ParaDrugCreator();
        Drug drug =creator.getDrug();
        System.out.println(drug.getNames()+"的成分");
        System.out.println(drug.getConstitute());
        creator=new AmorDrugCreator();
        drug=creator.getDrug();
        drug=creator.getDrug();
        System.out.println(drug.getNames()+"的成分");
        System.out.println(drug.getConstitute());

    }
}