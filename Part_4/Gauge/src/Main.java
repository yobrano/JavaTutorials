//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Guage g = new Guage();
    while (!g.full()){
        System.out.println("Not full! Value: "+g.value());
        g.increase();
    }

    System.out.println("Full! "+g.value());

    g.decrease();
    System.out.println("Not full! Value: "+g.value());


}
