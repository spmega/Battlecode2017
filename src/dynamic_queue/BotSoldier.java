package dynamic_queue;
import battlecode.common.*;

public class BotSoldier extends Globals {
	public static void loop() throws GameActionException {
		while (true) {
            try {
            	loop_common();
            	
            	Micro.SoldierFight();
                
            	end_loop_common();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
}
