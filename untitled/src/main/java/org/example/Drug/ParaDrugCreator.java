package org.example.Drug;

/**
 * @date 2023/9/18 20:04
 */
public class ParaDrugCreator implements DrugCreater{

    @Override
    public Drug getDrug() {
        int[]a={250,15,1,10};
        Drug drug=new Paracetamol("氨加黄敏胶囊",a);
        return drug;
    }
}
