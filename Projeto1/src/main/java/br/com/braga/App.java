package br.com.braga;

import br.com.braga.dao.ClienteMapDAO;
import br.com.braga.dao.IClienteDAO;
import br.com.braga.domain.Cliente;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(
                null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                "Green dinner",
                JOptionPane.INFORMATION_MESSAGE
        );

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(
                    null,
                    "Opção invalida, digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                    "Green dinner",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        while (isOpcaoValida(opcao)){
            if(isOpcaoSair(opcao)){
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(
                        null,
                        "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereco, Numero, Cidade, Estado",
                        "Cadastro de cliente",
                        JOptionPane.INFORMATION_MESSAGE
                );
                cadastrar(dados);
            } else if(isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(
                        null,
                        "Diite o CPF do cliente",
                        "Consulta de cliente",
                        JOptionPane.INFORMATION_MESSAGE
                );
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(
                        null,
                        "Digite o CPF do cliente",
                        "Exclusão de cliente",
                        JOptionPane.INFORMATION_MESSAGE
                );
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(
                        null,
                        "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereco, Numero, Cidade, Estado",
                        "Atuallização",
                        JOptionPane.INFORMATION_MESSAGE
                );
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(
                    null,
                    "Opção invalida, digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                    "Green dinner",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],
                dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(
                null,
                "Cliente exluido com sucesso: ",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente encontrado com sucesso" + cliente.toString(),
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente não encontrado",
                    "ERRO",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    private static boolean isConsulta(String opcao) {
        if("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],
                dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente cadastrado com sucesso",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Clientejá se encontra cadastrado",
                    "Erro",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        String clientesCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clientesCadastrados += cliente.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Clientes cadastrados: " + clientesCadastrados);
        System.exit(0);
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }
    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)){
            return true;
        }
        return false;
    }
}
