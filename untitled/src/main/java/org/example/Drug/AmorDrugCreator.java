package org.example.Drug;

/**
 * @date 2023/9/18 20:06
 */
public class AmorDrugCreator implements DrugCreater{
    @Override
    public Drug getDrug() {
        int[]a={200,5};
        Drug drug=new Paracetamol("甲硝锉胶囊",a);
        return drug;
    }
}
