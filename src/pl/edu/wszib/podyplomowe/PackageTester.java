package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.java.PackagePresenter;

public class PackageTester {

    public static void main(String[] args) {
        System.out.println("Pakiet " + PackageTester.class.getClass().getPackageName());
        PackagePresenter javapackagePresenter =new PackagePresenter();
        javapackagePresenter.showPackage();

      //  pl.edu.wszib.podyplomowe.PackagePresenter podyplomowe = new pl.edu.wszib.podyplomowe.PackagePresenter();
    }
}
