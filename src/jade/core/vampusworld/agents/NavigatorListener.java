package jade.core.vampusworld.agents;

import jade.core.Agent;

import java.util.List;

/**
@author Pryima Anna
*/

public interface NavigatorListener {
    void navigatorListModelChanged(List<? super Agent> hunters);
}
