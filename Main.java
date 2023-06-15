import java.util.Scanner;
import java.util.SortedMap;
import org.junit.rules.TemporaryFolder;
import java.util.Random;

// Utilizamos apenas uma classe para o jogo inteiro
class Main {

  // Criamos uma variável global, para armazenar o nome do usuário e utilizá-lo em
  // todas as funções criadas no decorrer do jogo. Outra para armazenar a
  // quantidade de vidas, começando o jogo com 3 vidas. E outra para armazenar a
  // quantidade de fases, para que quando conclua as 3 fases e os 9 desafios,
  // chegue ao fim e a vitória do jogo.
  static String nomedeusuario;
  static int variaveldavida = 3;
  static int variaveldasfases = 1;

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println();

    String apresentacao = "ENIAC - UMA VIAGEM NO TEMPO\n\n";
    temporarizador(apresentacao);

    String apresentacao1 = "Bem vindo viajante!\n";
    temporarizador(apresentacao1);

    int resposta = 0;

    // Colocamos o Do/While, para fazer um looping dentro do menu principal do jogo,
    // assim, o usuário pode acessar todo o menu quantas veze ele quiser.
    do {

      System.out.println();
      System.out.println("1- Instruções");
      System.out.println("2- Objetivo do Jogo");
      System.out.println("3- Jogar");
      System.out.println("4- Créditos");
      System.out.println("5- Sair");

      System.out.println();
      System.out.println("Digite a opção desejada:");

      resposta = ler.nextInt();

      // Colocamos o Switch no menu, para determinar as escolhas do usuário.
      switch (resposta) {
        case 1:
          System.out.println();
          System.out.println("- Como Jogar?");
          System.out.println(
              "- Selecione as opções quando for solicitado e responda de acordo com o que for pedido. Desafios iniciais geram pontos que acumulados podem te dar uma vida! Desafios finais fazem com que você passe de fase!");
          System.out.println("- Boa Sorte!");
          break;

        case 2:
          System.out.println();
          System.out.println("- Vencer as 3 fases e os 3 desafios finais de cada uma");
          System.out.println(
              "- Acertar os 6 desafios bônus, cada fase possui 2 (são os dois primeiros), assim, você ganha vidas extras!");
          System.out.println("- Coletar todos os códigos necessários para vencer o jogo!");
          break;

        case 3:
          System.out.println();
          String inicio = "Iniciando o jogo...\n";
          temporarizador(inicio);
          break;

        case 4:
          System.out.println();
          System.out.println("Criado por:");
          System.out.println("Allan Victor de Sousa silva");
          System.out.println("Murilo Alves dos Santos");
          break;

        case 5:
          System.out.println();
          System.out.println("Saindo...");
          break;

        default:
          System.out.println();
          System.out.println("Opção inválida, reiniciando o jogo...");
      }

    } while (resposta != 5 && resposta != 3);

    // Criamos um IF fora do looping, para que se o usuário escolhesse a opção 3
    // (que inicia o jogo), o mesmo fosse executado, separadamente.
    if (resposta == 3) {
      jogo();
    }
  }

  // Função resposável pelo jogo.
  public static void jogo() {
    Scanner usuario = new Scanner(System.in);

    System.out.println();
    System.out.println("Insira o seu nome viajante:");
    nomedeusuario = usuario.nextLine();

    System.out.println();
    String inicio1 = "Narrador: Bem vindo " + nomedeusuario + "!\n";
    temporarizador(inicio1);

    System.out.println();
    String introducao = "Narrador: Estamos no ano 3000, a evolução da tecnologia chegou ao seu maior patamar, a viagem no tempo. Criado pelo cientista Kronus, o ENIAC, um portal interdimensional, permite que as pessoas possam visitar períodos históricos importantes. Não satisfeito, ele quer aperfeiçoar a máquina, fazendo com que seja possível viajar também para o futuro! Porém ele descobriu que os códigos para configurar a máquina, estão no passado, quando as primeiras máquinas tecnológicas ainda estavam sendo inventadas.";
    temporarizador(introducao);

    System.out.println();
    System.out.println();
    String introducao1 = "Narrador: Você está pronto para ajudar Kronus, nesta incrível jornada " + nomedeusuario + "?";
    temporarizador(introducao1);

    System.out.println();
    System.out.println();
    System.out.println("Sim - Digite 1");
    System.out.println("Não - Digite 2");

    int opção = usuario.nextInt();

    if (opção == 1) {
      continuajogo();
    } else if (opção == 2) {
      System.out.println("Narrador: Que Pena!");
      System.out.println("Narrador: Te esperamos em uma próxima jornada!");
      System.out.println("Saindo do jogo...");
    } else {
      System.out.println("Opção inválida!");
      System.out.println("Saindo do jogo...");
    }
  }

  // Criamos uma nova função, para dar continuidade ao jogo, fora do IF anterior.
  public static void continuajogo() {

    System.out.println();

    String enredo00 = "Narrador: Maravilha " + nomedeusuario + "!\n\n" + "Narrador: Iniciando a sua jornada...";
    temporarizador(enredo00);

    System.out.println();
    
    String enredo = "\nScarlet: Olá " + nomedeusuario + ", me chamo Scarlet! Seja bem vindo a ArkMed, nossa querida e caótica cidadela. O Dr. Kronus me pediu que te levasse até o laboratório, as coisas por aqui podem acontecer muito rápido e não queremos que você se perca por aí né? Pode acabar caindo em um buraco de minhocas perdido, ou quem sabe esbarrar com um T-29...";
    temporarizador(enredo);

    System.out.println();
    String enredo2 = "\nScarlet: Acredite, os robôs podem ser mais perigosos do que parecem!";
    temporarizador(enredo2);

    System.out.println();
    String enredo3 = "\nScarlet: Eu to te deixando com medo né? Haha! Mas não se preocupe, conheço esse lugar muito bem, vou te levar até o laboratório em segurança!";
    temporarizador(enredo3);

    System.out.println();
    System.out.println();
    String enredo4 = "Scarlet: Eu não parei de falar até agora, me fala um pouco de você, o que te fez topar essa missão maluca?";
    temporarizador(enredo4);

    // Criamos Strings ao longo do jogo, durante os diálogos, para que os usuários
    // possam interagir e se sentirem participativos na história.
    System.out.println();
    System.out.println();
    System.out.print("Você:");
    Scanner dialogo1 = new Scanner(System.in);
    String resposta1 = dialogo1.nextLine();

    System.out.println();

    String enredo5 = "Scarlet: Que legal! Quando o Dr. me falou sobre essa missão, me perguntou se eu queria fazer parte. Eu disse pra ele que precisava ser muito doido pra topar uma coisa dessas, viagens no tempo são muito imprevisíveis! Mas topei ajudar na parte técnica do projeto, afinal, vamos fazer história com essa missão! Admiro sua coragem!";
    temporarizador(enredo5);

    System.out.println();
    System.out.println();
    String enredo6 = "Scarlet: E me conta, de onde você veio?";
    temporarizador(enredo6);

    System.out.println();
    System.out.println();
    System.out.print("Você:");
    Scanner dialogo2 = new Scanner(System.in);
    String resposta2 = dialogo2.nextLine();

    System.out.println();
    String enredo7 = "Scarlet: Agora eu entendi porque você topou, aquele lugar é mais caótico que a cidadela haha! Brincadeira, to te sacaneando. Conversamos tanto que olha ali, chegamos ao laboratório.";
    temporarizador(enredo7);

    System.out.println();
    System.out.println();
    String enredo8 = "Scarlet: Bem Vindo ao lugar onde tudo acontece, tem muita coisa legal pra fazer aqui, uma pena termos que realizar a missão agora, tinha várias coisas para te mostrar! Mas quando você voltar, podemos nos aventurar por aí! Bom, eu vou indo, preciso preparar a máquina para a missão, foi bom te conhecer, viu!";
    temporarizador(enredo8);

    System.out.println();
    System.out.println();
    String enredo9 = "Scarlet: Ah! O Dr. já está vindo ao seu encontro. Boa Sorte " + nomedeusuario + "!";
    temporarizador(enredo9);

    System.out.println();
    System.out.println();
    String enredo10k = "\nKronus: Ora ora quem está por aqui! Seja muito bem vindo " + nomedeusuario + "!";
    temporarizador(enredo10k);

    System.out.println();
    System.out.println();
    String enredo11k = "Kronus: Como você está?";
    temporarizador(enredo11k);

    System.out.println();
    System.out.println();
    System.out.print("Você:");
    Scanner dialogo3 = new Scanner(System.in);
    String resposta3 = dialogo3.nextLine();

    System.out.println();
    String enredo12k = "Kronus: Fico feliz com isso! Bom, como havíamos conversado antes, você será meu ajudante nesta jornada, irá visitar diferentes épocas em que as principais máquinas da computação foram criadas. Vai conhecer seus criadores e ajudará eles no processo da criação, em troca eles te darão os códigos que precisamos para inserir na máquina. Cada vez que você conseguir um código, te trago de volta para recarregarmos o seu relógio temporal!";
    temporarizador(enredo12k);

    System.out.println();
    System.out.println();
    String enredo13k = "Kronus: Está pronto? Podemos começar os preparos?";
    temporarizador(enredo13k);

    System.out.println();
    System.out.println();
    System.out.print("Você:");
    Scanner dialogo4 = new Scanner(System.in);
    String resposta4 = dialogo4.nextLine();

    System.out.println();
    String enredo14k = "Kronus: Ótimo! Me acompanhe por favor, temos muito o que fazer!";
    temporarizador(enredo14k);

    System.out.println();
    System.out.println();
    String enredo15k = "Kronus: Bem vindo ao ponto central do laboratório, aqui é onde tudo vai acontecer! Este é ENIAC, o nosso portal interdimensional, através dele você viajará para nossas missões, quando acabarmos, se quiser, posso te transportar para onde você quiser! Se obtivermos sucesso na missão é claro! Para onde e em que época você se transportaria?";
    temporarizador(enredo15k);

    System.out.println();
    System.out.println();
    System.out.print("Você:");
    Scanner dialogo5 = new Scanner(System.in);
    String resposta5 = dialogo5.nextLine();

    System.out.println();
    String enredo16k = "Kronus: Hmmm... Interessante! E por qual motivo você gostaria de visitar esse momento específico da sua vida?";
    temporarizador(enredo16k);

    System.out.println();
    System.out.println();
    System.out.print("Você:");
    Scanner dialogo6 = new Scanner(System.in);
    String resposta6 = dialogo6.nextLine();

    System.out.println();
    String enredo17k = "Kronus: É um motivo deveras plausível! Quem sabe agente não concretiza esta viagem não é mesmo?";
    temporarizador(enredo17k);

    System.out.println();
    System.out.println();
    String enredo18k = "Kronus: Mas chega de papo, vamos ao que interessa, aqui na mesa você vai encontrar tudo o que precisa!";
    temporarizador(enredo18k);

    System.out.println();
    System.out.println();
    String enredo19k = "Kronus: Este é seu relógio temporal, é o dispositivo que me permite te trazer de volta da viagem do tempo, sem ele você ficaria preso no passado para sempre! Por isso nunca o perca!";
    temporarizador(enredo19k);

    System.out.println();
    System.out.println();
    String enredo20k = "Kronus: Essa é a sua câmera memorizadora Apple Cam 3000, ela permite que você registre um momento em vídeo e consiga revivê-lo novamente por até 30 segundos";
    temporarizador(enredo20k);

    System.out.println();
    System.out.println();
    String enredo21k = "Kronus: Isso aqui é um cyber locker, ele consegue destravar qualquer tipo de fechadura, pode ser muito útil se você precisar entrar em algum lugar ou ficar preso em algum.";
    temporarizador(enredo21k);

    System.out.println();
    System.out.println();
    String enredo22k = "Kronus: Esta é uma câmera ocular, é como uma lente de contato, através dela eu consigo ver tudo o que você está vendo.";
    temporarizador(enredo22k);

    System.out.println();
    System.out.println();
    String enrendo23k = "Kronus: Essa arminha aqui é uma turbo mega gun, da polishop, ela pode atirar vários tipos de raios diferentes, pode congelar um inimigo, atirar fogo, raios elétricos e jatos de água realmente intensos. Nunca se sabe quando precisaremos apagar um fogo. Use-a com sabedoria!";
    temporarizador(enrendo23k);

    System.out.println();
    System.out.println();
    String enredo24k = "Kronus: E por último, a mochila quadridimensional. Ela possui um pequeno infinito quântico dentro dela, cabe tudo o que você quiser, você pode até morar dentro dela se quiser, estoque com o que precisar, o peso dela sempre vai ser o mesmo: O de uma mochila comum";
    temporarizador(enredo24k);

    System.out.println();
    System.out.println();
    String enrendo25k = "Kronus: Acho que isso é tudo, você tem alguma dúvida?";
    temporarizador(enrendo25k);

    System.out.println();
    System.out.println();
    System.out.print("Você:");
    Scanner dialogo7 = new Scanner(System.in);
    String resposta7 = dialogo7.nextLine();

    System.out.println();
    String enredo26k = "Kronus: Que pena! Não temos tempo para dúvidas, estamos atrasados! Pegue todos os dispositivos, vista o seu traje interdimensional e venha comigo, Scarlet me disse que a máquina já está pronta!";
    temporarizador(enredo26k);

    System.out.println();
    System.out.println();
    String enredo27k = "Kronus: Lembrando que precisaremos visitar três épocas diferentes, mas cada uma delas será surpresa para você, assim será mais divertido haha! Fique tranquilo que assim que você chegar em cada uma delas, te explicarei como chegar ao nosso objetivo!";
    temporarizador(enredo27k);

    System.out.println();
    System.out.println();
    String enredo28k = "Kronus: Confiamos em você! Não nos decepcione " + nomedeusuario + "!";
    temporarizador(enredo28k);

    System.out.println();
    System.out.println();
    String enredo29k = "Kronus: Que a força esteja com você!";
    temporarizador(enredo29k);

    System.out.println();
    System.out.println();
    String enredo30k = "Kronus: Basta pular no portal e chegará onde precisa! 3...2..1. AGORA!";
    temporarizador(enredo30k);

    // Utilizamos o método Random, para que as fases fossem iniciadas de forma
    // aleatória, deste modo cada vez que o úsuario jogar o jogo, sera de uma forma
    // diferente.
    Random random = new Random();
    int escolha = random.nextInt(3) + 1;

    if (escolha == 1) {
      fasex();

    } else if (escolha == 2) {
      fasey();

    } else {
      fasez();
    }

  }

  // Fizemos diferentes funções para cada fase
  public static void fasex() {

    System.out.println();
    System.out.println();
    String enredofase01 = "Kronus no relógio: Bem vindo a missão da calculadora! Nosso objetivo nesta missão é ajudar Gottfried Leibnitz, a criar a primeira antecessora direta das calculadoras manuais, a Calculadora de Leibnitz. Mas pelo que vi aqui, como você pode notar no visor do seu relógio, você está em 1633, 38 anos antes dela ser criada";
    temporarizador(enredofase01);

    System.out.println();
    System.out.println();
    String perguntainicio = "Kronus no relógio: Isso porque primeiro você precisa fazer uma visita a William Oughtred, vejo pela sua câmera ocular que você está no jantar de apresentção de uma idéia genial dele, me diga, o que ele criou?";
    temporarizador(perguntainicio);

    Scanner ler1 = new Scanner(System.in);
    String pergunta1;

    System.out.println();
    System.out.println();
    System.out.println("a) Ossos de Napier");
    System.out.println("b) Círculos de proporção");
    System.out.println("c) Logaritmos de Napier");
    System.out.println("d) Régua de Cálculos");
    System.out.println("e) Ábaco");

    System.out.println();
    System.out.println("Narrador: Digite sua resposta:");

    pergunta1 = ler1.nextLine();

    switch (pergunta1) {
      case "a":
      case "A":

        System.out.println();
        System.out.println();
        String enredoresposta01 = "Narrador: Passou perto, mas não! Os Ossos de napier foram criados em 1617 por John Napier, mas foi um bom chute!";
        temporarizador(enredoresposta01);

        System.out.println();
        System.out.println();
        System.out.println();
        String enredoresposta02 = "Kronus no relógio: A resposta certa é a régua de cálculos, ela foi o primeiro computador analógico da história!";
        temporarizador(enredoresposta02);
        break;

      case "b":
      case "B":
        System.out.println();
        System.out.println();
        String enredoresposta03 = "Narrador: QUASE! Os Círculos de proporção, foram métodos que Oughtred usou para representar os logaritmos de Napier";
        temporarizador(enredoresposta03);

        System.out.println();
        System.out.println();
        System.out.println();
        String enredoresposta04 = "Kronus no relógio: A resposta certa é a régua de cálculos, ela foi o primeiro computador analógico da história!";
        temporarizador(enredoresposta04);
        break;

      case "c":
      case "C":
        System.out.println();
        String enredoresposta05 = "Narrador: Infelizmente não, Napier na época em que você está, já é passado!";
        temporarizador(enredoresposta05);

        System.out.println();
        System.out.println();
        System.out.println();
        String enredoresposta06 = "Kronus no relógio: A resposta certa é a régua de cálculos, ela foi o primeiro computador analógico da história!";
        temporarizador(enredoresposta06);
        break;

      case "d":
      case "D":

        String enredoresposta07 = "\nNarrador: Isso mesmo, muito bem!\n\nNarrador: Você ganhou uma vida!";
        temporarizador(enredoresposta07);
        variaveldavida++;
        System.out.println();
        String enredovida = "Narrador: Agora você tem: " + variaveldavida + " vidas!";
        temporarizador(enredovida);

        System.out.println();
        System.out.println();
        System.out.println();
        String enredoresposta08 = "Kronus no relógio: A resposta certa é a régua de cálculos, ela foi o primeiro computador analógico da história!";
        temporarizador(enredoresposta08);
        break;

      case "e":
      case "E":
        System.out.println();
        System.out.println();
        String enredoresposta09 = "Narrador: Passou longe! O Ábaco foi iventado há aproximadamente 4.000 a.C, era um aparelho muito simples formado por uma placa de argila onde se escreviam algarismos que auxiliavam nos cálculos";
        temporarizador(enredoresposta09);

        System.out.println();
        System.out.println();
        System.out.println();
        String enredoresposta10 = "Kronus no relógio: A resposta certa é a régua de cálculos, ela foi o primeiro computador analógico da história!";
        temporarizador(enredoresposta10);

        break;

      default:

        System.out.println();
        System.out.println();
        String invalido = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
        temporarizador(invalido);

        System.out.println();
        System.out.println();
        System.out.println();
        String correto = "Kronus no relógio: A resposta certa é a régua de cálculos, ela foi o primeiro computador analógico da história!";
        temporarizador(correto);
    }
    System.out.println();
    System.out.println();
    String enredo31k = "Kronus no relógio: Agora vamos para 1642, onde você encontrará um frânces de 18 anos, que criou um dispositivo sensacional, importantíssimo para que Leibnitz conseguisse criar sua calculadora!";
    temporarizador(enredo31k);

    System.out.println();
    System.out.println();
    String enredo32k = "Kronus no relógio: O Salto já está configurado para você ir até lá! Basta apertar o botão amarelo no relógio, mas vá até um lugar seguro, não queremos que as pessoas no passado se assustem!";
    temporarizador(enredo32k);

    System.out.println();
    System.out.println();
    String enredo33k = "Kronus no relógio: Muito bem, este lugar está bom, um banheiro abandonado não seria minha primeira escolha, mas vamos lá!";
    temporarizador(enredo33k);

    System.out.println();
    System.out.println();
    System.out.println("Kronus no relógio: 3...2..1. SALTAR!");

    System.out.println();
    System.out.println();
    String enredo34k = "Narrador: " + nomedeusuario
        + " salta em direção ao seu destino desconhecido em 1642, ainda com muitas perguntas, mas seguindo o plano.";
    temporarizador(enredo34k);

    System.out.println();
    System.out.println();
    System.out.println();
    String perguntasegunda = "Kronus no relógio: Bem vindo ao hotel onde Blaise Pascal está hospedado para uma convenção de invenções, Você poderá encontrá-lo no saguão principal para fazer algumas perguntas sobre sua invenção, se eu me lembro bem, é uma máquina que executava operações aritméticas quando se giravam seus discos interligados, qual era o nome mesmo?";
    temporarizador(perguntasegunda);

    Scanner ler2 = new Scanner(System.in);
    String pergunta2;
    System.out.println();
    System.out.println();
    System.out.println("a) Pascalina");
    System.out.println("b) Coletor de Blaise");
    System.out.println("c) Máquina de somar de Pascal");
    System.out.println("d) Régua de cálculos IV");
    System.out.println("e) Calculador Manual");

    System.out.println();
    System.out.println("Narrador: Digite sua resposta:");

    pergunta2 = ler2.nextLine();

    switch (pergunta2) {
      case "a":
      case "A":
        System.out.println();
        String enredoresposta001 = "Narrador: Isso mesmo, voce acertou";
        temporarizador(enredoresposta001);

        System.out.println();
        System.out.println();
        String enredoresposta002 = "Narrador: Você ganhou uma vida!";
        temporarizador(enredoresposta002);
        variaveldavida++;

        System.out.println();
        System.out.println();
        String enredoresposta003 = "Narrador: Agora você tem: " + variaveldavida + " vidas!";
        temporarizador(enredoresposta003);

        System.out.println();
        String enredoresposta004 = "Kronus no relógio: A resposta certa é a Pascalina, ela foi a primeira máquina de somar da história!";
        System.out.println();
        System.out.println();
        temporarizador(enredoresposta004);
        break;

      case "b":
      case "B":
        System.out.println();
        String enredoresposta005 = "Narrador: Não foi desta vez!";
        temporarizador(enredoresposta005);

        System.out.println();
        System.out.println();
        System.out.println();
        String enredoresposta006 = "Kronus no relógio: A resposta certa é a Pascalina, ela foi a primeira máquina de somar da história!";
        temporarizador(enredoresposta006);
        break;

      case "c":
      case "C":
        System.out.println();
        String enredoresposta007 = "Narrador: Infelizmente não!";
        temporarizador(enredoresposta007);

        System.out.println();
        System.out.println();
        String enredoresposta008 = "Kronus no relógio: A resposta certa é a Pascalina, ela foi a primeira máquina de somar da história!";
        temporarizador(enredoresposta008);
        break;

      case "d":
      case "D":
        System.out.println();
        String enredoresposta009 = "Narrador: Nananinanão";
        temporarizador(enredoresposta009);

        System.out.println();
        System.out.println();
        String enredoresposta010 = "Kronus no relógio: A resposta certa é a Pascalina, ela foi a primeira máquina de somar da história!";
        temporarizador(enredoresposta010);
        break;

      case "e":
      case "E":
        System.out.println();
        String enredoresposta012 = "Narrador: Quase hein!";
        temporarizador(enredoresposta012);

        System.out.println();
        System.out.println();
        String enredoresposta013 = "Kronus no relógio: A resposta certa é a Pascalina, ela foi a primeira máquina de somar da história!";
        temporarizador(enredoresposta013);
        break;

      default:
        System.out.println();
        String enredoresposta014 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
        temporarizador(enredoresposta014);

        String enredoresposta015 = "Kronus no relógio: A resposta certa é a Pascalina, ela foi a primeira máquina de somar da história!";
        temporarizador(enredoresposta015);

    }
    System.out.println();
    System.out.println();
    String enredo35k = "Kronus no relógio: Espero que sua conversa tenha sido revigorante! Agora temos que ir até 1671, ano de invenção da calculadora, aperte o botão no relógio em 3...2..1. AGORA!";
    temporarizador(enredo35k);

    System.out.println();
    System.out.println();
    String enredo36k = "Kronus no relógio: Willkommen in Deutschland, ou devo dizer, bem vindo à Alemanha! Terra Natal de Gottfried Leibnitz, você deve encontrá-lo em uma festa que terá hoje em comemoração ao seu aniversário, para que ele termine a calculadora, é preciso que você compartilhe com ele tudo o que aprendeu com Pascal, ele provavelmente te fará algumas perguntas para ter certeza que você é confiável. Mas confio no seu potencial de atuar bem.";
    temporarizador(enredo36k);

    System.out.println();
    System.out.println();
    System.out.println(
        "Kronus no relógio: Seja investigativo, precisamos do código que ele guarda para a atualização do ENIAC, contamos com você! Boa Sorte.");

    System.out.println();
    String enredo37k = "Narrador: " + nomedeusuario
        + " então parte em direção à festa, chegando lá, encontra Leibnitz e com sua atuação impecável, conversa com ele.";
    temporarizador(enredo37k);

    System.out.println();
    System.out.println();
    String perguntaterceira = "\nLeibnitz: Então quer dizer que você estudou as teorias de Pascal, o que você me disse faz todo sentido! Estou trabalhando em uma invenção nova e preciso ir além de Pascal, quero algo mais revolucionário!";
    temporarizador(perguntaterceira);

    System.out.println();
    System.out.println();
    String enredo38k = "Leibnitz: Em relação ao código que me pediu, darei à você, porém você deve me responder algo muito importante, já que é entusiasta do meu trabalho! Quando minha invenção estiver pronta, o que ela será capaz de fazer?\n";
    temporarizador(enredo38k);

    Scanner ler3 = new Scanner(System.in);
    String pergunta3;

    do {

      System.out.println();
      System.out.println("a) Somar e Dividir");
      System.out.println("b) Dividir, multiplicar e Subtrair");
      System.out.println("c) Dividir e multiplicar");
      System.out.println("d) Somar, dividir, multiplicar e subtrair");
      System.out.println("e) Multiplicar e somar");

      System.out.println();
      System.out.println("Narrador: Digite sua resposta:");

      pergunta3 = ler3.nextLine();

      switch (pergunta3) {
        case "a":
        case "A":
          System.out.println();
          String enredo39 = "Narrador: Não.";
          temporarizador(enredo39);

          System.out.println();
          System.out.println();
          variaveldavida--;
          String enredo40 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(enredo40);
          System.out.println();
          break;

        case "b":
        case "B":
          System.out.println();
          String enredo41 = "Narrador: Errou.";
          temporarizador(enredo41);

          System.out.println();
          System.out.println();
          variaveldavida--;
          String enredo42 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(enredo42);
          System.out.println();
          break;

        case "c":
        case "C":
          System.out.println();
          String enredo43 = "Narrador: Isso mesmo, muito bem!";
          temporarizador(enredo43);

          System.out.println();
          System.out.println();
          String enredo44 = "Narrador: Você passou de fase!";
          temporarizador(enredo44);

          variaveldasfases++;

          System.out.println();
          System.out.println();
          System.out.println();
          String enredo45 = "Leibnitz: A resposta certa é Dividir e Multiplicar! A Pascalina apenas soma, por isso estou desenvolvendo um dispositivo que será capaz de efetuar cálculos de multiplicação e divisão. Agora só preciso de um nome bacana para ele, tem alguma sugestão?";
          temporarizador(enredo45);

          System.out.println();
          System.out.println();
          String enredo46 = "Leibnitz: Parece que você é realmente um entusiasta do meu trabalho, fico feliz em saber disso! Agora cumprirei minha parte do acordo, o codigo que você precisa é XSFH - 4DC6 - GGCS - 3XOL - WWAF. Agora preciso ir, preciso dar atenção à todos os convidados da festa, foi bom te conhecer "
              + nomedeusuario + " !";
          temporarizador(enredo46);

          System.out.println();
          System.out.println();
          System.out.println();
          String enredo47 = "Kronus no relógio: Muito bem, código anotado, hora da próxima missão! Ajustando parâmetros e saltando em 3...2..1. AGORA!";
          temporarizador(enredo47);

          // Se o jogador completar as 3 fases e os 9 desafios ele chega ao fim do
          // jogo,exibindo uma mensagem de vitória.
          if (variaveldasfases == 4) {
            System.out.println();
            System.out.println("PARABÉNS VIAJANTE, VOCÊ GANHOU O JOGO");

            System.out.println();
            System.out.println("Kronus no relógio: Muito bem " + nomedeusuario
                + " , eu sabia que você conseguiria completar essa missão! Agora basta apertar o botão vermelho no relógio para você retormar ao laboratório. Sua volta já está programada, saltando em 3..2..1.");

            System.out.println();
            System.out.println();
            System.out.println("Continua em ENIAC 2 - A Revolução das Máquinas...");
            System.out.println();
            System.out.println("FIM");
          } else {
            fasey();
          }
          break;

        case "d":
        case "D":
          System.out.println();
          String enredo48 = "Narrador: Tente outra vez Jovem Padawan.";
          temporarizador(enredo48);

          System.out.println();
          System.out.println();
          variaveldavida--;
          String enredo49 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(enredo49);
          System.out.println();
          break;

        case "e":
        case "E":
          System.out.println();
          String enredo50 = "Narrador: Nota 0, tente novamente se puder.";
          temporarizador(enredo50);

          System.out.println();
          System.out.println();
          variaveldavida--;
          String enredo51 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(enredo51);
          System.out.println();
          break;

        default:
          System.out.println();
          System.out.println();
          String enredo52 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
          temporarizador(enredo52);

          System.out.println();
          System.out.println();
          String enredo53 = "Narrador: Basta usar sua câmera memorizadora Apple Cam 3000, para tentar novamente e digitar uma opção certa";
          temporarizador(enredo53);
      }

    } while (!pergunta3.equals("c") && !pergunta3.equals("C") && variaveldavida > 0);

    // Se o contador de vidas chegar a 0, o usuário tem um game over e o jogo
    // reinicia novamente.
    if (variaveldavida == 0) {
      System.out.println();
      String game = "GAME OVER\n";
      temporarizador(game);

      System.out.println();
      System.out.println();
      String reiniciar = "Reiniciando o Jogo...\n";
      temporarizador(reiniciar);
      jogo();
    }
  }

  public static void fasey() {

    System.out.println();
    System.out.println();
    String fasey01 = "Kronus no relógio: Bem vindo a missão de Babbage! Nosso objetivo nesta missão é ajudar Charles Babbage, a criar a sua máquina analítica, que ele criou após a sua máquina diferencial, que permitia cálculos trigonométricos e logaritmicos.";
    temporarizador(fasey01);

    System.out.println();
    System.out.println();
    String fasey02 = "Kronus no relógio: Mas primeiro você precisa fazer uma visita a Basile Bouchon, por isso você está em 1728 agora,vejo pela sua câmera ocular que você está na grande convenção de invenções da cidade, me diga, qual era a finalidade da invenção que Bouchon criou?";
    temporarizador(fasey02);

    Scanner ler1 = new Scanner(System.in);
    String pergunta1;

    System.out.println();
    System.out.println();
    System.out.println("a) Tear para tecer números em seda");
    System.out.println("b) Tear para tecer roupas de seda");
    System.out.println("c) Tear para tecer furos em seda");
    System.out.println("d) Tear para tecer formas em seda");
    System.out.println("e) Tear para tecer desenhos de seda");

    System.out.println();
    System.out.println("Narrador: Digite sua resposta:");

    pergunta1 = ler1.nextLine();

    switch (pergunta1) {
      case "a":
      case "A":
        System.out.println();
        String fasey03 = "Narrador: Passou perto, mas não!";
        temporarizador(fasey03);

        System.out.println();
        System.out.println();
        String fasey04 = "Kronus no relógio: A resposta certa é Tear para tecer desenhos de seda, os desenhos eram cifrados em folhas giratórias de papel perfurado e a máquina trabalhava com as agulhas que coincidiam com os furos.";
        temporarizador(fasey04);

        break;

      case "b":
      case "B":
        System.out.println();
        String fasey05 = "Narrador: QUASE!";
        temporarizador(fasey05);

        System.out.println();
        System.out.println();
        String fasey06 = "Kronus no relógio: A resposta certa é Tear para tecer desenhos de seda, os desenhos eram cifrados em folhas giratórias de papel perfurado e a máquina trabalhava com as agulhas que coincidiam com os furos.";
        temporarizador(fasey06);
        break;

      case "c":
      case "C":
        System.out.println();
        String fasey07 = "Narrador: Infelizmente não.";
        temporarizador(fasey07);

        System.out.println();
        System.out.println();
        String fasey08 = "Kronus no relógio: A resposta certa é Tear para tecer desenhos de seda, os desenhos eram cifrados em folhas giratórias de papel perfurado e a máquina trabalhava com as agulhas que coincidiam com os furos.";
        temporarizador(fasey08);
        break;

      case "d":
      case "D":
        System.out.println();
        String fasey09 = "Narrador: Passou longe!";
        temporarizador(fasey09);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasey10 = "Kronus no relógio: A resposta certa é Tear para tecer desenhos de seda, os desenhos eram cifrados em folhas giratórias de papel perfurado e a máquina trabalhava com as agulhas que coincidiam com os furos.";
        temporarizador(fasey10);

        break;

      case "e":
      case "E":
        System.out.println();
        String fasey11 = "Narrador: Isso mesmo, muito bem!";
        temporarizador(fasey11);

        System.out.println();
        String fasey12 = "Narrador: Você ganhou uma vida!";
        temporarizador(fasey12);
        variaveldavida++;

        System.out.println();
        String fasey13 = "Narrador: Agora você tem: " + variaveldavida + " vidas!";
        temporarizador(fasey13);

        System.out.println();
        System.out.println();
        String fasey14 = "Kronus no relógio: A resposta certa é Tear para tecer desenhos de seda, os desenhos eram cifrados em folhas giratórias de papel perfurado e a máquina trabalhava com as agulhas que coincidiam com os furos.";
        temporarizador(fasey14);
        break;

      default:
        System.out.println();
        String fasey15 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
        temporarizador(fasey15);

        System.out.println();
        System.out.println();
        String fasey16 = "Kronus no relógio: A resposta certa é Tear para tecer desenhos de seda, os desenhos eram cifrados em folhas giratórias de papel perfurado e a máquina trabalhava com as agulhas que coincidiam com os furos.";
        temporarizador(fasey16);
    }

    System.out.println();
    System.out.println();
    String fasey17 = "Kronus no relógio: Agora vamos para 1802, onde você encontrará Joseph Marie Jacquard, o homem que criou um dispositivo importantíssimo para que Babbage criasse sua máquina!";
    temporarizador(fasey17);

    System.out.println();
    String fasey18 = "Kronus no relógio: 3...2..1. SALTAR!";
    temporarizador(fasey18);

    System.out.println();
    System.out.println();
    String fasey19 = "Kronus no relógio: Bem vindo a França, cidade onde Jacquard nasceu e foi criado.Há uma convenção de invenções, Você poderá encontrá-lo lá para fazer algumas perguntas sobre sua invenção, se eu me lembro bem, é uma máquina que era capaz de automatizar os cartões perfurados de Bouchon, qual era o nome mesmo?";
    temporarizador(fasey19);

    Scanner ler2 = new Scanner(System.in);
    String pergunta2;

    System.out.println();
    System.out.println();
    System.out.println("a) Tear Funcional");
    System.out.println("b) Tear de Jacquard");
    System.out.println("c) Tear Automático");
    System.out.println("d) Tear Perfurante");
    System.out.println("e) Tear di Marie");

    System.out.println();
    String fasey20 = "Narrador: Digite sua resposta:";
    temporarizador(fasey20);

    pergunta2 = ler2.nextLine();

    switch (pergunta2) {
      case "a":
      case "A":
        System.out.println();
        String fasey21 = "Narrador: Não foi desta vez!";
        temporarizador(fasey21);
        System.out.println();
        System.out.println();
        String fasey22 = "Kronus no relógio: A resposta certa é Tear de Jacquard!";
        temporarizador(fasey22);
        break;

      case "b":
      case "B":
        System.out.println();
        String fasey23 = "Narrador: Isso mesmo, parabéns!";
        temporarizador(fasey23);

        System.out.println();
        System.out.println();
        String fasey24 = "Narrador: Você ganhou uma vida!";
        temporarizador(fasey24);
        variaveldavida++;

        System.out.println();
        System.out.println();
        String fasey25 = "Narrador: Agora você tem: " + variaveldavida + " vidas!";
        temporarizador(fasey25);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasey26 = "Kronus no relógio: A resposta certa é Tear de Jacquard!";
        temporarizador(fasey26);
        break;

      case "c":
      case "C":
        System.out.println();
        String fasey27 = "Narrador: Infelizmente não!";
        temporarizador(fasey27);
        System.out.println();
        System.out.println();
        String fasey28 = "Kronus no relógio: A resposta certa é Tear de Jacquard!";
        temporarizador(fasey28);
        break;

      case "d":
      case "D":
        System.out.println();
        String fasey29 = "Narrador: Nananinanão";
        temporarizador(fasey29);

        System.out.println();
        System.out.println();
        String fasey30 = "Kronus no relógio: A resposta certa é Tear de Jacquard!";
        temporarizador(fasey30);
        break;

      case "e":
      case "E":
        System.out.println();
        String fasey31 = "Narrador: Quase hein!";
        temporarizador(fasey31);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasey32 = "Kronus no relógio: A resposta certa é Tear de Jacquard!";
        temporarizador(fasey32);
        break;

      default:
        System.out.println();
        String fasey33 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
        temporarizador(fasey33);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasey34 = "Kronus no relógio: A resposta certa é Tear de Jacquard!";
        temporarizador(fasey34);
    }

    System.out.println();
    System.out.println();
    String fasey35 = "Kronus no relógio: Espero que sua conversa tenha sido revigorante! Agora temos que ir até 1834, ano da invenção de Babbage, aperte o botão no relógio em 3...2..1. AGORA!";
    temporarizador(fasey35);

    System.out.println();
    System.out.println();
    System.out.println();
    String fasey36 = "Kronus no relógio: Welcome to London, ou devo dizer, bem vindo à Londres! Terra Natal de Charles Babbage, você deve encontrá-lo em uma festa que terá hoje em comemoração ao aniversário de seu filho Charles Whitmore. Para que ele termine a invenção, é preciso que você compartilhe com ele tudo o que aprendeu com Jacquard, ele provavelmente te fará algumas perguntas para ter certeza que você é confiável. Mas confio no seu potencial de atuar bem.";
    temporarizador(fasey36);

    System.out.println();
    System.out.println();
    String fasey37 = "Kronus no relógio: Seja investigativo, precisamos do código que ele guarda para a atualização do ENIAC, contamos com você! Boa Sorte.";
    temporarizador(fasey37);

    System.out.println();
    System.out.println();
    System.out.println();
    String fasey38 = "Narrador: " + nomedeusuario
        + " então parte em direção à festa, chegando lá, encontra Babbage e com sua atuação impecável, conversa com ele.";
    temporarizador(fasey38);

    System.out.println();
    System.out.println();
    System.out.println();
    String fasey39 = "Babbage: Então quer dizer que você estudou os cartões de Jacquard, o que você me disse faz todo sentido! Estou trabalhando em uma invenção nova, uma Máquina Analítica, que vai além da minha máquina diferencial, preciso ir além!";
    temporarizador(fasey39);

    System.out.println();
    System.out.println();
    String fasey40 = "Babbage: Em relação ao código que me pediu, darei à você, porém você deve me responder algo muito importante, já que é entusiasta do meu trabalho! Quando minha invenção nova estiver pronta, o que ela será capaz de fazer?";
    temporarizador(fasey40);

    Scanner ler3 = new Scanner(System.in);
    String pergunta3;

    do {

      System.out.println();
      System.out.println();
      System.out.println("a) Somar, dividir, subtrair e multiplicar");
      System.out.println("b) Dividir e subtrair");
      System.out.println("c) Multiplicar e subtrair");
      System.out.println("d) Dividir, multiplicar e somar");
      System.out.println("e) Multiplicar e somar");

      System.out.println();
      String fasey41 = "Narrador: Digite sua resposta:";
      temporarizador(fasey41);

      pergunta3 = ler3.nextLine();

      switch (pergunta3) {
        case "a":
        case "A":
          System.out.println();
          String fasey42 = "Narrador: Isso mesmo, muito bem!";
          temporarizador(fasey42);

          System.out.println();
          System.out.println();
          String fasey43 = "Narrador: Você passou de fase!";
          temporarizador(fasey43);

          variaveldasfases++;

          System.out.println();
          System.out.println();
          System.out.println();
          String fasey44 = "Babbage: A resposta certa é Somar, dividir, subtrair e multiplicar!";
          temporarizador(fasey44);

          System.out.println();
          System.out.println();
          String fasey45 = "Babbage: Parece que você é realmente um entusiasta do meu trabalho, fico feliz em saber disso! Agora cumprirei minha parte do acordo, o codigo que você precisa é KLJF - 8G33 - LLBV - 22RR - 09KS. Agora preciso ir, preciso dar atenção à todos os convidados da festa, foi bom te conhecer "
              + nomedeusuario + " !";
          temporarizador(fasey45);

          System.out.println();
          System.out.println();
          System.out.println();
          String fasey46 = "Kronus no relógio: Muito bem, código anotado, hora da próxima missão! Ajustando parâmetros e saltando em 3...2..1. AGORA!";
          temporarizador(fasey46);

          // Se o jogador completar as 3 fases e os 9 desafios ele chega ao fim do jogo,
          // exibindo uma mensagem de vitória.
          if (variaveldasfases == 4) {
            System.out.println();
            String fasey47 = "PARABÉNS VIAJANTE, VOCÊ GANHOU O JOGO";
            temporarizador(fasey47);

            System.out.println();
            String fasey48 = "Kronus no relógio: Muito bem " + nomedeusuario
                + " , eu sabia que você conseguiria completar essa missão! Agora basta apertar o botão vermelho no relógio para você retormar ao laboratório. Sua volta já está programada, saltando em 3..2..1.";
            temporarizador(fasey48);

            System.out.println();
            System.out.println();
            String fasey49 = "Continua em ENIAC 2 - A Revolução das Máquinas...";
            temporarizador(fasey49);

            System.out.println();
            String fasey50 = "FIM";
            temporarizador(fasey50);

          } else {
            fasez();
          }
          break;

        case "b":
        case "B":
          System.out.println();
          String fasey51 = "Narrador: Errou.";
          temporarizador(fasey51);
          System.out.println();

          variaveldavida--;

          String fasey52 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasey52);
          break;

        case "c":
        case "C":
          System.out.println();
          String fasey53 = "Narrador: Não.";
          temporarizador(fasey53);
          System.out.println();

          variaveldavida--;

          String fasey54 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasey54);
          break;

        case "d":
        case "D":
          System.out.println();
          String fasey55 = "Narrador: Tente outra vez.";
          temporarizador(fasey55);
          System.out.println();

          variaveldavida--;

          String fasey56 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasey56);
          break;

        case "e":
        case "E":
          System.out.println();
          String fasey57 = "Narrador: Nota dó, tente novamente.";
          temporarizador(fasey57);
          System.out.println();

          variaveldavida--;

          String fasey58 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasey58);

        default:
          System.out.println();
          String fasey59 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
          temporarizador(fasey59);

          System.out.println();
          String fasey60 = "Narrador: Basta usar sua câmera memorizadora Apple Cam 3000, para tentar novamente e digitar uma opção certa";
          temporarizador(fasey60);
      }

      // Enquanto o jogador não acertar a resposta certa e as vidas não acabarem,
      // continua rodando o desafio final de cada fase.
    } while (!pergunta3.equals("a") && !pergunta3.equals("A") && variaveldavida > 0);

    // Se o contador de vidas chegar a 0, o usuário tem um game over e o jogo
    // reinicia novamente.
    if (variaveldavida == 0) {
      System.out.println();
      String fasey61 = "GAME OVER";
      temporarizador(fasey61);

      System.out.println();
      String fasey62 = "Reiniciando o Jogo...";
      temporarizador(fasey61);

      jogo();
    }
  }

  public static void fasez() {

    System.out.println();
    System.out.println();
    String fasez01 = "Kronus no relógio: Bem vindo a missão Mark I! Nosso objetivo nesta missão é ajudar o professor Howard Aiken, a criar o primeiro computador eletromecânico, que ele criou com ajuda da IBM.";
    temporarizador(fasez01);

    System.out.println();
    System.out.println();
    String fasez02 = "Kronus no relógio: Mas primeiro você precisa fazer uma visita a Hermann Hollerith, por isso você está em 1890 agora,vejo pela sua câmera ocular que você está no parlamento da cidade, me diga, qual era a finalidade da invenção que Hollerith criou?";
    temporarizador(fasez02);

    Scanner ler1 = new Scanner(System.in);
    String pergunta1;

    System.out.println();
    System.out.println();
    System.out.println("a) Realizava os holerites de trabalho");
    System.out.println("b) Realizava os desenhos de Hollerith");
    System.out.println("c) Realizava operações aritméticas");
    System.out.println("d) Realizava cálculos matemáticos");
    System.out.println("e) Realizava o censo demográfico");

    System.out.println();
    System.out.println("Narrador: Digite sua resposta:");

    pergunta1 = ler1.nextLine();

    switch (pergunta1) {
      case "a":
      case "A":
        System.out.println();
        String fasez03 = "Narrador: Passou perto, mas não!";
        temporarizador(fasez03);
        System.out.println();
        System.out.println();
        String fasez04 = "Kronus no relógio: A resposta certa é, Realizava o censo demográfico, os censos na época demoravam até 10 anos para serem realizados, com a máquina de Hollerith, o tempo caiu para apenas 3 anos.";
        temporarizador(fasez04);
        break;

      case "b":
      case "B":
        System.out.println();
        String fasez05 = "Narrador: QUASE!";
        temporarizador(fasez05);

        System.out.println();
        System.out.println();
        String fasez06 = "Kronus no relógio: A resposta certa é, Realizava o censo demográfico, os censos na época demoravam até 10 anos para serem realizados, com a máquina de Hollerith, o tempo caiu para apenas 3 anos.";
        temporarizador(fasez06);
        break;

      case "c":
      case "C":
        System.out.println();
        String fasez07 = "Narrador: Infelizmente não.";
        temporarizador(fasez07);
        System.out.println();
        System.out.println();
        String fasez08 = "Kronus no relógio: A resposta certa é, Realizava o censo demográfico, os censos na época demoravam até 10 anos para serem realizados, com a máquina de Hollerith, o tempo caiu para apenas 3 anos.";
        temporarizador(fasez08);
        break;

      case "d":
      case "D":
        System.out.println();
        String fasez09 = "Narrador: Passou longe!";
        temporarizador(fasez09);

        System.out.println();
        System.out.println();
        String fasez10 = "Kronus no relógio: A resposta certa é, Realizava o censo demográfico, os censos na época demoravam até 10 anos para serem realizados, com a máquina de Hollerith, o tempo caiu para apenas 3 anos.";
        temporarizador(fasez10);
        break;

      case "e":
      case "E":
        System.out.println();
        String fasez11 = "Narrador: Isso mesmo, muito bem!";
        temporarizador(fasez11);

        System.out.println();
        System.out.println();
        String fasez12 = "Narrador: Você ganhou uma vida!";
        temporarizador(fasez12);

        variaveldavida++;

        System.out.println();
        System.out.println();
        String fasez13 = "Narrador: Agora você tem: " + variaveldavida + " vidas!";
        temporarizador(fasez13);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasez14 = "Kronus no relógio: A resposta certa é, Realizava o censo demográfico, os censos na época demoravam até 10 anos para serem realizados, com a máquina de Hollerith, o tempo caiu para apenas 3 anos.";
        temporarizador(fasez14);
        break;

      default:
        System.out.println();
        String fasez15 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
        temporarizador(fasez15);

        System.out.println();
        System.out.println();
        String fasez16 = "Kronus no relógio: A resposta certa é, Realizava o censo demográfico, os censos na época demoravam até 10 anos para serem realizados, com a máquina de Hollerith, o tempo caiu para apenas 3 anos.";
        temporarizador(fasez16);
    }

    System.out.println();
    System.out.println();
    String fasez17 = "Kronus no relógio: Agora vamos para 1943, onde você encontrará Alan Touring, o homem que criou um dispositivo importantíssimo para que Aiken criasse sua máquina!";
    temporarizador(fasez17);

    System.out.println();
    System.out.println();
    String fasez18 = "Kronus no relógio: 3...2..1. SALTAR!";
    temporarizador(fasez18);

    System.out.println();
    System.out.println();
    String fasez19 = "Kronus no relógio: Bem vindo a Londres, cidade onde Alan Touring nasceu e foi criado.Há uma escola de Código e Cifras do Governo em Bletchley Park, Você poderá encontrá-lo lá para fazer algumas perguntas sobre sua invenção, se eu me lembro bem, é uma máquina que era capaz de acelerar a quebra das cifras alemãs, incluindo melhorias no método de bombardeio polonês antes da guerra, qual era o nome mesmo?";
    temporarizador(fasez19);

    Scanner ler2 = new Scanner(System.in);
    String pergunta2;

    System.out.println();
    System.out.println("a) Máquina de Touring");
    System.out.println("b) Colossus");
    System.out.println("c) Andromeda");
    System.out.println("d) Eniac");
    System.out.println("e) Edvac");

    System.out.println();
    System.out.println("Narrador: Digite sua resposta:");

    pergunta2 = ler2.nextLine();

    switch (pergunta2) {
      case "a":
      case "A":
        System.out.println();
        String fasez20 = "Narrador: Não foi desta vez!";
        temporarizador(fasez20);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasez21 = "Kronus no relógio: A resposta certa é Colossus! Ela trabalhava com símbolos perfurados numa argola de fita de papel, por leitura fotoelétrica, comparando a mensagem cifrada com os códigos conhecidos até encontrar uma coincidência. Ela era capaz de processar 25.000 ch por segundo.";
        temporarizador(fasez21);
        break;

      case "b":
      case "B":
        System.out.println();
        String fasez22 = "Narrador: Isso mesmo, parabéns!";
        temporarizador(fasez22);

        System.out.println();
        System.out.println();
        String fasez23 = "Narrador: Você ganhou uma vida!";
        temporarizador(fasez23);

        variaveldavida++;
        System.out.println();
        System.out.println();
        String fasez24 = "Narrador: Agora você tem: " + variaveldavida + " vidas!";
        temporarizador(fasez24);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasez25 = "Kronus no relógio: A resposta certa é Colossus! Ela trabalhava com símbolos perfurados numa argola de fita de papel, por leitura fotoelétrica, comparando a mensagem cifrada com os códigos conhecidos até encontrar uma coincidência. Ela era capaz de processar 25.000 ch por segundo.";
        temporarizador(fasez25);
        break;

      case "c":
      case "C":
        System.out.println();
        String fasez26 = "Narrador: Infelizmente não!";
        temporarizador(fasez26);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasez27 = "Kronus no relógio: A resposta certa é Colossus! Ela trabalhava com símbolos perfurados numa argola de fita de papel, por leitura fotoelétrica, comparando a mensagem cifrada com os códigos conhecidos até encontrar uma coincidência. Ela era capaz de processar 25.000 ch por segundo.";
        temporarizador(fasez27);
        break;

      case "d":
      case "D":
        System.out.println();
        String fasez28 = "Narrador: Nananinanão";
        temporarizador(fasez28);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasez29 = "Kronus no relógio: A resposta certa é Colossus! Ela trabalhava com símbolos perfurados numa argola de fita de papel, por leitura fotoelétrica, comparando a mensagem cifrada com os códigos conhecidos até encontrar uma coincidência. Ela era capaz de processar 25.000 ch por segundo.";
        temporarizador(fasez29);
        break;

      case "e":
      case "E":
        System.out.println();
        String fasez30 = "Narrador: Quase hein!";
        temporarizador(fasez30);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasez31 = "Kronus no relógio: A resposta certa é Colossus! Ela trabalhava com símbolos perfurados numa argola de fita de papel, por leitura fotoelétrica, comparando a mensagem cifrada com os códigos conhecidos até encontrar uma coincidência. Ela era capaz de processar 25.000 ch por segundo.";
        temporarizador(fasez31);
        break;

      default:
        System.out.println();
        String fasez32 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
        temporarizador(fasez32);

        System.out.println();
        System.out.println();
        System.out.println();
        String fasez33 = "Kronus no relógio: A resposta certa é Colossus! Ela trabalhava com símbolos perfurados numa argola de fita de papel, por leitura fotoelétrica, comparando a mensagem cifrada com os códigos conhecidos até encontrar uma coincidência. Ela era capaz de processar 25.000 ch por segundo.";
        temporarizador(fasez33);
    }

    System.out.println();
    System.out.println();
    String fasez34 = "Kronus no relógio: Espero que sua conversa tenha sido revigorante! Agora temos que ir até 1944, ano da invenção de Aiken, aperte o botão no relógio em 3...2..1. AGORA!";
    temporarizador(fasez34);

    System.out.println();
    System.out.println();
    String fasez35 = "Kronus no relógio: Welcome to Cambridge, ou devo dizer, bem vindo à Cambridge, Massachusetts, EUA! Cidade onde está localizada a universidade de Harvard, onde Howard Aiken desenvolveu seu computador, você deve encontrá-lo em um evento social da universidade que acontece hoje. Para que ele termine a invenção, é preciso que você compartilhe com ele tudo o que aprendeu com Alan Touring, ele provavelmente te fará algumas perguntas para ter certeza que você é confiável.";
    temporarizador(fasez35);

    System.out.println();
    System.out.println();
    String fasez36 = "Kronus no relógio: Seja investigativo, precisamos do código que ele guarda para a atualização do ENIAC, contamos com você! Boa Sorte.";
    temporarizador(fasez36);

    System.out.println();
    System.out.println();
    System.out.println();
    String fasez37 = "Narrador: " + nomedeusuario
        + " então parte em direção ao evento, chegando lá, encontra Aiken e com sua atuação impecável, conversa com ele.";
    temporarizador(fasez37);

    System.out.println();
    System.out.println();
    System.out.println("____________________________");
    String fasez38 = "Aiken: Então quer dizer que você estudou a invenção de Alan Touring, o que você me disse faz todo sentido! Estou trabalhando em uma invenção nova, um tipo mais moderno de computador, preciso me destacar na comunidade científica de qualquer forma, tem muito dinheiro em jogo!";
    temporarizador(fasez38);

    System.out.println();
    System.out.println();
    String fasez39 = "Aiken: Em relação ao código que me pediu, darei à você, porém você deve me responder algo muito importante, já que é entusiasta do meu trabalho! Quando minha invenção nova estiver pronta, qual tipo de sistema ela vai utilizar para executar seus programas?";
    temporarizador(fasez39);

    Scanner ler3 = new Scanner(System.in);
    String pergunta3;

    do {
      System.out.println();
      System.out.println();
      System.out.println("a) Sistema decimal");
      System.out.println("b) Sistema octal");
      System.out.println("c) Sistema primário");
      System.out.println("d) Sistema hexadecimal");
      System.out.println("e) Sistemas numéricos");

      System.out.println();
      System.out.println("Narrador: Digite sua resposta:");

      pergunta3 = ler3.nextLine();

      switch (pergunta3) {
        case "a":
        case "A":
          System.out.println();
          String fasez40 = "Narrador: Isso mesmo, muito bem!";
          temporarizador(fasez40);

          System.out.println();
          System.out.println();
          String fasez41 = "Narrador: Você passou de fase!";
          temporarizador(fasez41);

          variaveldasfases++;

          System.out.println();
          System.out.println();
          System.out.println();
          String fasez42 = "Aiken: A resposta certa é Sistema decimal! Além disso ela terá 15 metros de comprimento e 2,5 metros de altura, super pequena comparanda a outras mais antigas, não acha? Pretendo que ela realize cálculos em até 10 segundos também, um recorde na história.";
          temporarizador(fasez42);

          System.out.println();
          System.out.println();
          String fasez43 = "Aiken: Parece que você é realmente um entusiasta do meu trabalho, fico feliz em saber disso! Agora cumprirei minha parte do acordo, o codigo que você precisa é HBGP - 6X9S - KKOA - 77CX - 000H. Agora preciso ir, preciso conversar com meus investidores "
              + nomedeusuario + " !";
          temporarizador(fasez43);

          System.out.println();
          System.out.println();
          System.out.println();
          String fasez44 = "Kronus no relógio: Muito bem, código anotado, hora da próxima missão! Ajustando parâmetros e saltando em 3...2..1. AGORA!";
          temporarizador(fasez44);

          // Se o jogador completar as 3 fases e os 9 desafios ele chega ao fim do
          // jogo,exibindo uma mensagem de vitória.
          if (variaveldasfases == 4) {
            System.out.println();
            String fasez45 = "PARABÉNS VIAJANTE, VOCÊ GANHOU O JOGO";
            temporarizador(fasez45);
            System.out.println();
            System.out.println();
            String fasez46 = "Kronus no relógio: Muito bem " + nomedeusuario
                + " , eu sabia que você conseguiria completar essa missão! Agora basta apertar o botão vermelho no relógio para você retormar ao laboratório. Sua volta já está programada, saltando em 3..2..1.";
            temporarizador(fasez46);

            System.out.println();
            System.out.println();
            String fasez47 = "Continua em ENIAC 2 - A Revolução das Máquinas...";
            temporarizador(fasez47);

            System.out.println();
            System.out.println();
            System.out.println("FIM");
          } else {
            fasex();
          }
          break;

        case "b":
        case "B":
          System.out.println();
          String fasez48 = "Narrador: Putz, não.";
          temporarizador(fasez48);

          System.out.println();

          variaveldavida--;

          String fasez49 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasez49);
          break;

        case "c":
        case "C":
          System.out.println();
          String fasez50 = "Narrador: Quem sabe em outra vida.";
          temporarizador(fasez50);

          System.out.println();
          System.out.println();

          variaveldavida--;

          String fasez51 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasez51);
          break;

        case "d":
        case "D":
          System.out.println();
          System.out.println("Narrador: Acho que não hein.");
          System.out.println();
          System.out.println();
          variaveldavida--;

          String fasez52 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasez52);
          break;

        case "e":
        case "E":
          System.out.println();
          System.out.println("Narrador: Não, seguido de mais um não.");
          System.out.println();
          System.out.println();
          variaveldavida--;

          String fasez53 = "Narrador: Infelizmente você perdeu uma vida! Agora restam: " + variaveldavida + " vidas!";
          temporarizador(fasez53);
          break;

        default:
          System.out.println();
          String fasez54 = "Narrador: Opção inválida, acho que você cometeu um erro na hora de digitar";
          temporarizador(fasez54);

          System.out.println();
          System.out.println();
          String fasez55 = "Narrador: Basta usar sua câmera memorizadora Apple Cam 3000, para tentar novamente e digitar uma opção certa";
          temporarizador(fasez55);
      }

      // Enquanto o jogador não acertar a resposta certa e as vidas não acabarem,
      // continua rodando o desafio final de cada fase.
    } while (!pergunta3.equals("a") && !pergunta3.equals("A") && variaveldavida > 0);

    // Se o contador de vidas chegar a 0, o usuário tem um game over e o jogo
    // reinicia novamente.
    if (variaveldavida == 0) {
      System.out.println();
      System.out.println("GAME OVER");
      System.out.println();
      System.out.println("Reiniciando o Jogo...");
      jogo();
    }
  }

  // Criamos um método para que os diálogos fossem exibidos, como se os
  // personagens estivessem conversando.
  static void temporarizador(String mensagem) {
    for (int i = 0; i < mensagem.length(); i++) {
      System.out.print(mensagem.charAt(i));
      try {
        Thread.sleep(000001);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}