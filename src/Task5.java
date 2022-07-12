import java.util.Scanner;

public class Task5 {
    //    Королю нужно убить дракона, но в его казне мало средств
//    для покупки армии. Нужно создать программу, используя
//    методы, которая поможет рассчитать минимальное количество копейщиков, которое необходимо, чтобы убить
//    дракона. C клавиатуры вводятся данные:
//■ здоровья дракона;
//■ атаки дракона;
//■ здоровье одного копейщика;
//■ атака одного копейщика.
//            Защита, меткость и т. п. не учитывать. Копейщики наносят
//    удар первыми (общий нанесенный урон – это сумма атак
//            всех живых копейщиков). Если атака дракона превышает
//    значение жизни копейщика (например, у копейщика жизни – 10, а атака – 15), то умирает несколько копейщиков, а
//    оставшийся урон идет одному из копейщиков
    public static void main(String[] args) {


        int hpDragon;
        int attackDragon;
        int hpSpearman;
        int attackSpearman;
        int amountSp = 1;
        boolean dragonAlive = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите здоровье дракона : ");
        hpDragon = scanner.nextInt();
        System.out.print("Введите атаку дракона : ");
        attackDragon = scanner.nextInt();
        System.out.print("Введите здоровье копейщика : ");
        hpSpearman = scanner.nextInt();
        System.out.print("Введите атаку копейщика : ");
        attackSpearman = scanner.nextInt();

        int hpDrTMP = hpDragon;
        while (dragonAlive) {
            int allHpSP = amountSp * hpSpearman;
            hpDragon = hpDrTMP;

            while (allHpSP > 0) {
                System.out.print("ХПД " + hpDragon + " ");
                if (allHpSP % hpSpearman == 0) {
                    System.out.print("ХПС " + allHpSP + " ");
                    hpDragon -= attackSpearman * allHpSP / hpSpearman;
                    System.out.print("ХПД " + hpDragon + " ");
                } else {
                    System.out.print("ХПС " + allHpSP + " ");
                    hpDragon -= attackSpearman * (1 + allHpSP / hpSpearman);
                    System.out.print("ХПД " + hpDragon + " ");
                }
                if (hpDragon <= 0) {
                    System.out.println("Нужное колличество копейщиков : " + amountSp);
                    dragonAlive = false;
                    break;
                } else {
                    allHpSP -= attackDragon;
                    System.out.print("ХПС " + allHpSP + "\n");
                }
            }
            if (hpDragon <= 0) {
                break;
            } else {
                System.out.println(amountSp + " Не справились");
                amountSp++;
            }
        }
    }
}
