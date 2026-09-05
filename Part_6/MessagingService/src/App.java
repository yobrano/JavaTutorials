public class App {
    public static void main(String[] args) throws Exception {
        // testMessage();
        testMessageService();
    }

    public static void testMessage(){
        Message yobraMessage = new Message("yobra", "Vile ina faa");
        System.out.println(yobraMessage);
        System.out.println(yobraMessage.getLength());
        Message charlieMessage = new Message("Charlie", "Economics... Economic... Money... investments.");
        System.out.println(charlieMessage);
        System.out.println(charlieMessage.getLength());
        System.out.println("Are the two messages the same: " + yobraMessage.equals(charlieMessage));
    }

    public static void testMessageService(){
        Message yobraMessage = new Message("yobra", "Vile ina faa");
        Message charlieMessage = new Message("Charlie", "Economics... Economic... Money... investments.");
        String longMessage = "";
        for(int i = 0; i<300; i++){
            longMessage += "," +  i;
        }
        Message machineMessage = new Message("Machine", longMessage);

        MessagingService service = new MessagingService();
        System.out.println(service.getMessages());
        service.add(charlieMessage);
        System.out.println(service.getMessages());
        service.add(yobraMessage);
        System.out.println(service.getMessages());
        
        service.add(machineMessage);
        System.out.println(service.getMessages());
        



    }

}
