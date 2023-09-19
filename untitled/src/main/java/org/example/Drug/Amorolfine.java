package org.example.Drug;

/**
 * @date 2023/9/18 19:59
 */
public class Amorolfine extends Drug {
    String part1="粒含甲硝锉";
    String part2="每粒含人工牛黄";
    public Amorolfine(String name,int []a){
        this.names=name;
        part1= part1+":"+a[0]+"毫克\n";
        part2= part2+":"+a[1]+"毫克\n";

        constitute=part1+part2;}
}
