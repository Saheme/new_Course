package edu.javaRushCourse.JavaSyntax.level9.lesson6;

/**
 * В скрытых папках памяти корабля обнаружено настолько много огромных файлов, что даже простое удаление их всех займет несколько дней.
 * <p>
 * Придется прибегнуть к процедуре низкоуровневого удаления файлов, но для этого нам нужно как-то пометить файлы подлежащие удалению.
 * <p>
 * В массивах santaFabrica и eroticSimulators хранятся хеш-суммы серий "Санта Фабрики" и эротических симуляторов.
 * В них нужно пометить единицами 13-й, 21-й и 29-й биты. Это и будет наша метка. Реализуй этот функционал в методе markForDeletion.
 * <p>
 * Требования:
 * •	В методе markForDeletion нужно установить в 1 биты 13, 21, 29 всем элементам santaFabrica.
 * •	В методе markForDeletion нужно установить в 1 биты 13, 21, 29 всем элементам eroticSimulators.
 */
public class Task187 {
    public static long[] santaFabrica = new long[99000];
    public static long[] eroticSimulators = new long[100500];

    public static void main(String[] args) {
        // test
        markForDeletion();
        System.out.println(Long.toBinaryString(santaFabrica[0]));
    }

    public static void markForDeletion() {
        for (int i = 0; i < santaFabrica.length; i++) {

            santaFabrica[i] = santaFabrica[i] | (1 << 13);
            santaFabrica[i] = santaFabrica[i] | (1 << 21);
            santaFabrica[i] = santaFabrica[i] | (1 << 29);

        }
        for (int i = 0; i < eroticSimulators.length; i++) {

            eroticSimulators[i] = eroticSimulators[i] | (1 << 13);
            eroticSimulators[i] = eroticSimulators[i] | (1 << 21);
            eroticSimulators[i] = eroticSimulators[i] | (1 << 29);

        }
    }
}
//if ((santaFabrica[i] & (1 << 13)) == (1 << 13) & ((santaFabrica[i] & (1 << 21)) == (1 << 21)) & (santaFabrica[i] & (1 << 29)) == (1 << 29)) {

//  if ((eroticSimulators[i] & (1 << 13)) == (1 << 13) | ((eroticSimulators[i] & (1 << 21)) == (1 << 21)) | (eroticSimulators[i] & (1 << 29)) == (1 << 29)) {