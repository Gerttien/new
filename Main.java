//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String months[] = {"JAN", "FEB", "MAR"};
    String deliveries[] = {"DELIVERIES 2018", "DELIVERIES 2019", "DELIVERIES 2020"};
    int numbers[][] = {{128, 135, 139}, {155, 129, 175}, {129, 130, 185}};
int total=0;
int max=numbers[0][0];
int min=numbers[0][0];

    System.out.println("********************************************");
    System.out.println("DELIVERIES REPORT");
    System.out.println("*****************************************");

    System.out.printf("%-18s", " ");

    for (int i = 0; i < months.length; i++) {
        System.out.printf("%-18s",months[i]);
    }
    System.out.println();

    for (int p = 0; p < deliveries.length; p++) {
        System.out.printf("%-18s",deliveries[p]);
        for (int e = 0; e < numbers[p].length; e++) {
            System.out.printf("%-18s",numbers[p][e]);

            total+=numbers[p][e];
            if(numbers[p][e]>max){
                max=numbers[p][e];
            }
        }
        System.out.println();

    }
    for(int i = 0; i<deliveries.length; i++){
        total = numbers[i][0] + numbers[i][1] ;

        System.out.println(deliveries[i] +" "+ total);
    }
    System.out.println("*******************************************************");
    System.out.println("DELIVERIES STATISTICS");
    System.out.println("*******************************************************");
    System.out.println("total deliveries: "+  total);
    System.out.println("maximum deliveries: "+  max);
    System.out.println("minimum deliveries: "+  min);
    System.out.println("****************************************************");
}


