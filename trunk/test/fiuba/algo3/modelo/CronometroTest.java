package fiuba.algo3.modelo;


import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CronometroTest {

    /** El resultado global puede variar con diferentes tiempos por la calibracion, error de segundos (+-1, +--2 aprox) */
    /** Comento porque a mirko le molesta que cuente mucho el cronometro :p
    Cronometro cronometroDePueba;
    int errorMaximo;
    int errorMinimo;

    @Before
    public void setUp() {
        cronometroDePueba = new Cronometro();
    }

    @After
    public void resetear() throws Exception {
        this.cronometroDePueba.reset();
    }

    @Test
    public void testDeberiaMarcarLosSegundosQuePasen() throws Exception {

        this.cronometroDePueba.iniciar();
        Thread.currentThread().sleep(10000); //Cuenta 10 seg
        this.cronometroDePueba.pausar();

        //Errores bordes, tiempo transcurrido + - el error del cronometro.
        this.errorMaximo = 10 + this.cronometroDePueba.errorEnSegundos();
        this.errorMinimo = 10 - this.cronometroDePueba.errorEnSegundos();

        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);
    }

    @Test
    public void testDeberiaPausarse() throws Exception {

        this.cronometroDePueba.iniciar();
        Thread.currentThread().sleep(10000); //Transcurren 10 seg
        this.cronometroDePueba.pausar();

        //Errores bordes, tiempo transcurrido + - el error del cronometro.
        this.errorMaximo = 10 + this.cronometroDePueba.errorEnSegundos();
        this.errorMinimo = 10 - this.cronometroDePueba.errorEnSegundos();

        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);

        Thread.currentThread().sleep(2000); //cronometro sigue pausado y deberia seguir valiendo lo mismo

        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);
    }

    @Test
    public void testDeberiaReanudarse() throws Exception {

        this.cronometroDePueba.iniciar();
        Thread.currentThread().sleep(9000); //Transcurren 9 seg
        this.cronometroDePueba.pausar();

        //Errores bordes, tiempo transcurrido + - el error del cronometro.
        this.errorMaximo = 9 + this.cronometroDePueba.errorEnSegundos();
        this.errorMinimo = 9 - this.cronometroDePueba.errorEnSegundos();

        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);

        Thread.currentThread().sleep(3000);  //Sigue pausado
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);

        this.cronometroDePueba.reanudar();
        Thread.currentThread().sleep(4000); //Reanudo y dejo correr 4 segundos.

        this.errorMaximo = errorMaximo + 4;   //Se acumula el error porque sigue transcurriendo tiempo.
        this.errorMinimo = errorMinimo + 4;

        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);
    }

    @Test
    public void testDeberiaResetiarse() throws Exception {

        this.cronometroDePueba.iniciar();
        Thread.currentThread().sleep(10000); //Cuenta 10 seg
        this.cronometroDePueba.pausar();

        //Errores bordes, tiempo transcurrido + - el error del cronometro.
        this.errorMaximo = 10 + this.cronometroDePueba.errorEnSegundos();
        this.errorMinimo = 10 - this.cronometroDePueba.errorEnSegundos();

        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
        Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);

        this.cronometroDePueba.reset();
        Thread.currentThread().sleep(5000); //Transcurre mas tiempo pero como esta reseteado deberia ser 0 el tiempo.

        Assert.assertEquals(0,this.cronometroDePueba.tiempoEnSegundos());
    }


   @Test
    public void testDeberiaPoderIncrementarUnPorcentajeDeTiempo() throws Exception {

       this.cronometroDePueba.iniciar();
       Thread.currentThread().sleep(40000); //Pasan 40 seg

       //Errores bordes, tiempo transcurrido + - el error del cronometro.
       this.errorMaximo = 40 + this.cronometroDePueba.errorEnSegundos();
       this.errorMinimo = 40 - this.cronometroDePueba.errorEnSegundos();

       Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
       Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);

       this.cronometroDePueba.variarPorcentaje(20);

       this.errorMaximo = errorMaximo + 8;   //Si pasaron 40 seg deberia sumarle unos 8 seg
       this.errorMinimo = errorMinimo + 8;

       Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) <= errorMaximo);
       Assert.assertTrue((this.cronometroDePueba.tiempoEnSegundos()) >= errorMinimo);
    } **/

}