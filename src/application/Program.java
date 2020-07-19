/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import br.com.cadastro.negocio.JogadorImpl;
import br.com.cadatro.model.Jogador;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args) throws IOException{
    
    Scanner read = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    JogadorImpl jimp = new JogadorImpl();
    
        String enderecoDir = "C:\\Users\\arquivosJava";
        System.out.println("Digite o caminho do arquivo :");
        String nomeArquivo = read.nextLine();
        List<Jogador> listaDeJogadores = jimp.getListJogadores(Paths.get(enderecoDir+"\\"+nomeArquivo));
        if(!jimp.verificarCaminho(Paths.get(enderecoDir))){
            System.out.println("Endereço nao encontrado");
        }
        else{
        
       
        jimp.imprimirJogadores(listaDeJogadores);
        
        System.out.println("--------------------");
        
        jimp.imprimirJogadorArtilheiro(listaDeJogadores);
        
        System.out.println("--------------------");
        
        jimp.imprimirJogadoresTime(listaDeJogadores, "Flamengo");
        System.out.println("--------------------");
        
        jimp.imprimirJogadorGoalsTeam(listaDeJogadores, "Vasco");
        
            System.out.println("--------------agrupado por time-----");
            
        jimp.gruparJogadoresPorTime(listaDeJogadores);
        
        }
    }
}
