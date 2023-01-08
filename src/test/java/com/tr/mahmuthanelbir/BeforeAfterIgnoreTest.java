package com.tr.mahmuthanelbir;

import org.junit.*;

import static org.junit.Assert.*;


public class BeforeAfterIgnoreTest {

    @BeforeClass
    public static void initClass() {
        System.out.println("==========");
        System.out.println("Sınıf BAŞLADIĞINDA bir defa çalışan 'static' metot");
        System.out.println("==========");
    }

    @AfterClass
    public static void destructClass() {
        System.out.println("==========");
        System.out.println("Sınıf BİTTİĞİNDE bir defa çalışan 'static' metot");
        System.out.println("==========");
    }

    @Before
    public void start() {
        System.out.println("==========");
        System.out.println("Her test metotundan ÖNCE bu yazı print edilecek");
    }

    @After
    public void stop() {
        System.out.println("Her test metotundan SONRA bu yazı print edilecek");
        System.out.println("==========");
    }

    @Ignore
    @Test
    public void willBeIgnoredTest() {
        System.out.println("IGNORE EDİLEN TEST OLDUĞU İÇİN BU MESAJ PRİNT EDİLMEYECEK FAKAT INTELLIJ TARAFINDAN 'Test ignored.' PRİNT EDİLEBİLİR");
        assertTrue(1 < 2);
    }

    @Test
    public void test2() {
        System.out.println("test1");
        assertTrue(1 < 2);
    }

    @Test
    public void test1() {
        System.out.println("test2");
        assertEquals(1, 1);
    }

    @Test
    public void test3() {
        System.out.println("test3");
        assertNull("message", null);
    }


    //Ekstra kullanım
    @Test(timeout = 1000)
    public void test4() {
        System.out.println("BU METOT EĞER 1000 MS'DEN FAZLA SÜRERSE FAİL VERECEK, timeout PARAMETRESİ İLE SONSUZ DÖNGÜLER TEST EDİLEBİLİR");
        while (true) ;
    }

}
