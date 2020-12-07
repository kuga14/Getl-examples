package process

import getl.test.GetlDslTest
import org.junit.Test


class FtpCopyTest extends GetlDslTest{

    @Test
    void testDownloadFile() {
        getl.lang.Getl.Dsl() {
            callScript FtpCopy
        }
    }
}
