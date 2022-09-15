import streamlit as st

st.title("uau pagina produto/principal")

oporra = st.text_input("pesquisa????")
st.slider('x')
st.button('x')
option = st.selectbox(
    'How would you like to be contacted?',
    ('Email', 'Home phone', 'Mobile phone'))

st.write('You selected:', option)
st.write(oporra)

st.write("container vindo carai se preparaaaaa")
c = st.container()
c.image('https://upload.wikimedia.org/wikipedia/en/thumb/d/dc/Thomas_Tank_Engine_1.JPG/220px-Thomas_Tank_Engine_1.JPG')
col1, col2, col3 = c.columns(3)

with col1:
    col1.write(" banana")

with col2:
    col2.image("https://upload.wikimedia.org/wikipedia/en/thumb/d/dc/Thomas_Tank_Engine_1.JPG/220px-Thomas_Tank_Engine_1.JPG")

with col3:
    col3.write("asdasdad ")
