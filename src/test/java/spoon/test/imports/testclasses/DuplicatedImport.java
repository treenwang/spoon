package spoon.test.imports.testclasses;

import static spoon.test.staticFieldAccess.internal.Extends.MY_OTHER_STATIC_VALUE;

public class DuplicatedImport {
    spoon.test.imports.testclasses.memberaccess.A duplicatedImport(spoon.test.imports.testclasses.A a1){
        spoon.test.imports.testclasses.multiplecu.A a3 = null;
        StaticImportsFromEnum.DataElement key = StaticImportsFromEnum.DataElement.KEY;
        String myOtherStaticValue = MY_OTHER_STATIC_VALUE;
        long prio = spoon.test.staticFieldAccess2.testclasses.Constants.PRIO;
        return null;
    }
}
