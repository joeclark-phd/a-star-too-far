# A Star Too Far

I have a game in mind that I'd like to develop; let me tell you about it.

I envision a complex, rich simulation of an interstellar civilization, with tens of thousands of simulated actors (traders, colonists, adventurers, pilgrims, military officers, etc) crossed with a slow-paced, intricate 4X strategy game.  With a somewhat fractal nature, players would be able to view the simulation at arbitrary levels of detail, zooming out to command entire space navies or zooming in to study the career of any individual pilot.  An industrial model with complex relationships of complement and substitution would allow each empire to structure its economy differently, so no playthrough would be the same.

## Some of the main design ideas:

- 4X play should be real-time, but very slow, giving players lots of time to think about the details and anticipate the action.  This'll be a game for those who like micromanaging, as much a simulation as a war game.

- Unlike many successful sci-fi games, there shouldn't be artificial choke points like "star gates" that force rivals into blob tactics.  Instead, complex space "terrain" will offer alternative paths and advantageous positions so that many different kinds of tactics are possible.  As in World War II in Europe, there should be strategic points like "bridges" but also tactics analogous to amphibious or airborne assaults.  No space war should be a guaranteed thing.

- The economy of minerals and manufacturing should be so complex that no empire can make everything for themselves.  But substitutes of various qualities will exist for everything, so no one totally monopolizes any capability.  This should lead to specialization, and lead to rivalries among "competitor" empires as well as alliances among "complementor" empires.

- The player will not rule as an omnipotent dictator as is common in strategy games; instead, he will control certain resources (i.e. the government budget and the navy) but many simulated actors will shape the civilization.  Importantly, colonists and traders themselves will decide where to settle and what to mine or produce, creating some chaos for the player to adapt to.  He cannot choose where to establish his borders, for example, and may be expected to defend planets or regions he didn't choose.

- Using procedural generation and generation of details on demand, it should be possible to efficiently simulate solar systems with thousands of objects and populations with hundreds of thousands of individuals, as long as the player isn't looking at all of them at once.  I hope to use procedural generation to give the player the experience of an incredibly rich, deep simulation, and as much micromanagement as he can handle.

- As the game grows bigger, the player will deal with a number of "helper" AIs, so the gameplay scales with the size of the empire.  At first, the player may give commands to individual ship captains.  Later, he may command squadrons, with a simulated commodore delegating tasks to individual ships.  Still later, he may give orders to fleets, or to whole navies.  A hierarchy of AIs would translate high-level orders into tasks to delegate to their subordinates.  The same concept may apply to the player's economic and industrial orders.  Ideally, the game could grow bigger without becoming tedious.

- The game should have very simple graphics, more like map symbols, both to engage the imagination and to lower the cost of adding new features.  As a personal project, the game should be quirky, with lots of easter eggs and inside jokes.  One of my ideas is to give it "bones" files -- a lost fleet from one player's game could appear in another player's universe, for example.

- Combat should play out excruciatingly slowly, with outcomes in many cases determined by decisions locked in long ago.  As in a good submarine movie, the player should be on the edge of his seat listening to the torpedo's sonar pings and waiting to find out if it will hit or miss.  Anticipation should be stretched out, and consequences should hit like a hammer.

## Next steps

I've been coding in Java lately and that's what I expect to use.  I have yet to learn the Java desktop APIs, and would like to try out OpenJFX to see if it's a good tool to use for this.  Naturally, a web browser with JavaScript/CSS could also work for a front-end.  A good first step, I think, would be to build a simulation of a solar system to demonstrate the complexity, and hopefully procedurally-generated beauty, of the kind of space civilization I intend to simulate.

