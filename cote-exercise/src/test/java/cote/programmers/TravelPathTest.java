package cote.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class TravelPathTest {
    private TravelPath travelPath;

    public TravelPathTest() {
        travelPath = new TravelPath();
    }

    @Test
    public void 테스트케이스1() {
        String[][] tickets = {{"ICN", "JFK"},{"HND", "IAD"},{"JFK", "HND"}};
        String[] result = {"ICN", "JFK", "HND", "IAD"};

        assertThat(travelPath.solution(tickets)).isEqualTo(result);
    }

    @Test
    public void 테스트케이스2() {
        String[][] tickets = {{"ICN", "SFO"},{"ICN", "ATL"},{"SFO", "ATL"},{"ATL", "ICN"},{"ATL","SFO"}};
        String[] result = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};

        assertThat(travelPath.solution(tickets)).isEqualTo(result);
    }
}

//[["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]	["ICN", "JFK", "HND", "IAD"]
//        [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]	["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]