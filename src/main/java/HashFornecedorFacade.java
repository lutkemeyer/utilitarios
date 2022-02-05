import org.apache.commons.codec.digest.DigestUtils;

import java.util.Date;

public class HashFornecedorFacade implements Facade {

    @Override
    public void executar() {

        Main.println("========= SISTEMA DE HASH DO FORNECEDOR =========");

        Main.println("Digite o nome do fornecedor:");
        Main.print("Digite: ");

        String nomeFornecedor = Main.lerString();
        Date date = new Date();

        Main.println("Nome do fornecedor: \"" + nomeFornecedor + "\"");
        Main.println("Data usada para gerar: \"" + date + "\"");

        String hash = DigestUtils.md5Hex(nomeFornecedor + date);

        Main.println("Hash: \"" + hash + "\"");

    }

}
