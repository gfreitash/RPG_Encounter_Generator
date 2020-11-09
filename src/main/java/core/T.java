package core;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class T {
    private static final Logger logger = LogManager.getLogger(T.class);

    public static void main(String[] args) throws InterruptedException {
        logger.info("Program started.");
        logger.info("Creating a new NPCs");



        NPC npc1 = new NPC();

        NPC npc2 = new NPC();
        logger.info("NPC created");

        System.out.println(npc1);
        System.out.println();
        System.out.println();
        System.out.println(npc2);
    }
}

