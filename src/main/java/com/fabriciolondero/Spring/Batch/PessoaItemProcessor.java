package com.fabriciolondero.Spring.Batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PessoaItemProcessor implements ItemProcessor<Pessoa, Pessoa> 
{
  private static final Logger log = LoggerFactory.getLogger(PessoaItemProcessor.class);

  @Override
  public Pessoa process(final Pessoa p) throws Exception 
  {
    final String nome = p.getNome().toUpperCase();
    final String sobrenome = p.getSobrenome().toUpperCase();

    final Pessoa pessoaAlterada = new Pessoa(nome, sobrenome);

    log.info("convertendo (" + p + ") para (" + pessoaAlterada + ")");

    return pessoaAlterada;
  }
}