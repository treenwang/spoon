package spoon.test.imports.testclasses;

public class DuplicatedImport {
    spoon.test.imports.testclasses.memberaccess.A duplicatedImport(spoon.test.imports.testclasses.A a1){
        spoon.test.imports.testclasses.multiplecu.A a3 = null;
        return null;
    }

    spoon.test.imports.testclasses.duplicate.d1.DuplicatedImport duplicatedImport2(DuplicatedImport a1) {
        spoon.test.imports.testclasses.duplicate.d2.DuplicatedImport a3 = null;
        return null;
    }
}
