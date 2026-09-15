package lab.m01.w01.d02.Good;

import java.util.zip.CheckedOutputStream;

public class CompanyPolicy {
    public static final  PercentOfsalary NHAN_VIEN = new PercentOfsalary(10);
    public static final  CompensationPolicy QUAN_LY = new CompensationPolicy() {
        @Override
        public double calculateBolus(Employee e) {
            return NHAN_VIEN.calculateBolus(e) + new FlatBonus(5).calculateBolus(e);
        }
    };
    public static final CompensationPolicy GIAM_DOC = new CompensationPolicy() {
        @Override
        public double calculateBolus(Employee e) {
            return QUAN_LY.calculateBolus(e) * 1.5;
        }
    };

    public static final NoBonus THUC_TAP = new NoBonus();

    public static final CompensationPolicy Contractor = new CompensationPolicy() {
        @Override
        public double calculateBolus(Employee e) {
            return new PercentOfsalary(3).calculateBolus(e);
        }
    };

}
