package pl.edu.wszib.jwd.pl.lab13;

import pl.edu.wszib.jwd.pl.lab13.PackageOne.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        pl.edu.wszib.jwd.pl.lab13.PackageOne.PackageTester pt1 = new pl.edu.wszib.jwd.pl.lab13.PackageOne.PackageTester();
        pl.edu.wszib.jwd.pl.lab13.PackageTwo.PackageTester pt2 = new pl.edu.wszib.jwd.pl.lab13.PackageTwo.PackageTester();
        pl.edu.wszib.jwd.pl.lab13.PackageThree.PackageTester pt3 = new pl.edu.wszib.jwd.pl.lab13.PackageThree.PackageTester();

        pt1.introduce();
        pt2.introduce();
        pt3.introduce();
    }

}
