package packet.client.handling;

import packet.server.response.struct.SecondaryStat;
import packet.server.response.struct.GW_CharacterStat;

public class PacketFlag {

    public static void Update() {
        MovementPacket.Init();
        TrunkPacket.Init();
        NPCPacket.Init();
        GW_CharacterStat.Init();
        SecondaryStat.Init();
        ContextPacket.Message_Init();
    }
}
