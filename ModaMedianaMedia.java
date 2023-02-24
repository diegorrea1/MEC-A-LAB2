import java.util.Arrays;

public class ModaMedianaMedia
{


  public static void main (String[]args)
  {

    calcularMMMM ();


  }
  public static void calcularMMMM ()
  {

    int n_elementos = 20;

    int numerosRandom[] = new int[n_elementos];

    for (int posN = 0; posN < numerosRandom.length; posN++)
      {

	int n = (int) (Math.random () * 10) + 1;

	numerosRandom[posN] = n;

      }
    Arrays.sort (numerosRandom);

    for (int i = 0; i < numerosRandom.length; i++)
      {

	System.out.print ("  " + numerosRandom[i]);

      }

    System.out.println ("");

    double media = 0.0;

    for (int i = 0; i < numerosRandom.length; i++)
      {

	media = media + numerosRandom[i];

      }
    media = media / numerosRandom.length;

    System.out.println ("Media =  " + media);


    int mediana = 0;

    if (numerosRandom.length == 1)
      {

	mediana = numerosRandom[0];

      }
    else
      {

	if (numerosRandom.length % 2 == 0)
	  {

	    mediana =
	      (numerosRandom[numerosRandom.length / 2 - 1] +
	       numerosRandom[numerosRandom.length / 2]) / 2;

	  }
	else
	  {

	    mediana = numerosRandom[numerosRandom.length / 2];

	  }

      }

    System.out.println ("mediana = " + mediana);


    int numerosDisitintos[] = new int[numerosRandom.length];

    for (int i = 0; i < numerosDisitintos.length; i++)
      {

	numerosDisitintos[i] = -1;

      }
    int posND = 0;

    int posR = 0;


    while (posR < numerosDisitintos.length)
      {

	int nr = numerosRandom[posR];

	int contarNexiste = 0;

	for (int i = 0; i < numerosDisitintos.length; i++)
	  {

	    if (nr == numerosDisitintos[i])
	      {

		contarNexiste++;

	      }

	  }

	if (contarNexiste == 0)
	  {

	    numerosDisitintos[posND] = nr;

	    posND++;

	  }

	posR++;

      }

    int cuentanumeros[] = new int[posND];

    for (int i = 0; i < posND; i++)
      {

	int nd = numerosDisitintos[i];

	for (int j = 0; j < numerosRandom.length; j++)
	  {

	    if (nd == numerosRandom[j])
	      {

		cuentanumeros[i]++;
	      }

	  }

      }

    int max = Integer.MIN_VALUE;
    int Nencontrado = -1;

    for (int i = 0; i < cuentanumeros.length; i++)
      {

	if (max < cuentanumeros[i])
	  {

	    Nencontrado = numerosDisitintos[i];
	    max = cuentanumeros[i];
	  }

      }

    int moda = Nencontrado;

    System.out.println ("Moda= " + moda);
  }
}
