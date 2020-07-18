package br.com.cadastro.negocio;  

import br.com.cadatro.model.Jogador;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;







    public class JogadorImpl {
   public boolean verificarCaminho(Path caminho){
   boolean ret = false;
    try{
                Stream<Path> stream =Files.list(caminho);
                Optional<Path> arq = stream.filter(p ->p.toString().endsWith("jogadores.txt")).findAny();
                ret = arq.isPresent();
    }catch(IOException erro){
                erro.printStackTrace();
                System.out.println("Erro :"+erro.getMessage()); 
    }
    return ret;
    }
    public List<Jogador> getListJogadores(Path caminho) throws IOException{
    Stream<String> linhas = Files.lines(caminho, StandardCharsets.ISO_8859_1);
    List<String> listLinhas = linhas.collect(Collectors.toList());
    List<Jogador> listJogadores = new ArrayList<>();
    
    Iterator it = listLinhas.listIterator();
    String str = null;
    
    while(it.hasNext()){
       str = (String) it.next();
        String[] camp =str.split(",");
        Jogador jogador = new Jogador();
        jogador.setPlayer(camp[0]);
        jogador.setPosition(camp[1]);
        jogador.setYear(Integer.parseInt(camp[2]));
        jogador.setCurrentTeam(camp[3]);
        jogador.setGoalsScored(Integer.parseInt(camp[4]));
        listJogadores.add(jogador);
        
    }
    return listJogadores;
    }
    }