package nl.stil4m.transmission.api.commands;

import nl.stil4m.transmission.api.domain.RemoveTorrentInfo;
import nl.stil4m.transmission.rpc.RpcCommand;

public class GetSessionCommand extends RpcCommand<RemoveTorrentInfo, Object> {

    public GetSessionCommand(Long tag) {
        super(tag);
    }

    @Override
    public String getMethod() {
        return "session-get";
    }
}
