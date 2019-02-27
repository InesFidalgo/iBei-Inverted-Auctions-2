package src.Top10LeiloesGanhos;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;


import rmi.RMI;
import rmi.Leilao;
import src.CreateLeilao.CreateLeilaoBean;


public class Top10LeiloesGanhosBean
{
	
	private RMI server;
	
	public int id;
	
	public String type;
	public String comandoresposta;

	
	public Top10LeiloesGanhosBean()
	{
		try
		{
			System.out.println("ligou!!!!!!!!!!!!1");
			System.setProperty("java.rmi.server.hostname", "localhost");
			this.server =  (RMI) LocateRegistry.getRegistry("localhost", 12345).lookup("rmi");
			//this.server = (RMI) Naming.lookup("rmi://localhost:12345");
		}
		catch(IOException |NotBoundException e)
		{
			e.printStackTrace();
		}
	}
	/*
	public String getLogin()
	{
		return this.login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}*/

	
	
	
	
	
	public String getComandoresposta() {
		
		//comandoresposta.replace("\n", "<br />");
		
		System.out.println("o comando da pagina:"+comandoresposta);
		return comandoresposta;
	}

	
	public boolean top10Top10LeiloesGanhos() throws RemoteException
	{
		try
		{	
			String[] versoesantigas = this.server.TopTenLeiloesGanhos();	
			comandoresposta = "Top 10 Winners: ";
			
			for (int j = 0; j < versoesantigas.length; j++)
			{
				comandoresposta = comandoresposta + versoesantigas[j] + ", ";
				
			}
			
			return true;
			
			
		}
		catch(IllegalArgumentException e)
		{
			return false;
		}
		
	}

	
}
