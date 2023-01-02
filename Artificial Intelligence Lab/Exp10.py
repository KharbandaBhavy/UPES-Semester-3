from pomegranate import *
from pomegranate import BayesianNetwork
#for exam level
exam_level = DiscreteDistribution({'T': .70, 'F': .30})
#for iq
iq = DiscreteDistribution({'T': .80, 'F': .20})
#first start with exam then iq then marks
Marks= ConditionalProbabilityTable([
    ['T', 'T', 'T', .60],
    ['T', 'T', 'F', .40],
    ['T', 'F', 'T', .90],
    ['T', 'F', 'F', .10],
    ['F', 'T', 'T', .50],
    ['F', 'T', 'F', .50],
    ['F', 'F', 'T', .80],
    ['F', 'F', 'F', .20],
], [exam_level, iq])

# Creating three nodes
d1 = Node(exam_level, name="exam_level")
d2 = Node(iq, name="iq")
d3 = Node(Marks, name="Marks")

# Building the Bayesian Network using pomegranate
network = BayesianNetwork("MAKING THE BAYSEIAN OF IQ LEVEL AND MARKS ")
network.add_states(d1, d2, d3)#add_states->Another name for a node.
network.add_edge(d2, d3)#add_edge->Add a transition from state a to state b which
network.add_edge(d1, d3)
network.bake()
#bake helps to build the bayseian network
# Taking user input to put the Bayesian network to use
Val_A = input(" enter t or f for exam level ")
Val_B = input(" enter t or f for iq level ")

# Making the prediction
#PREDICT PROBA  RETURNS THE PROBABILITY OF THE EACH VARIABLE IN GIVEN EVIDENCE

beliefs = network.predict_proba({'exam_level': Val_A, 'iq': Val_B})

# Displaying details
beliefs = map(str, beliefs)
print("\n".join("{}, {}".format(state.name, belief) for state, belief in zip(network.states, beliefs)))