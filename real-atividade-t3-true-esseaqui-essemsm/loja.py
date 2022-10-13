import streamlit as st

col1, col2, col3, col4, col5, col6 = st.columns([1, 20, 3, 2 , 3, 3])

with col2:
    pesquisa = st.text_input("Search for a product")

with col3:
    st.markdown("")
    st.write("")
    st.image("assets/search.jpg")

with col5:
    st.markdown("")
    st.write("")
    st.image("assets/carrin.jpg")

with col6:
    st.markdown("")
    st.write("")
    st.image("assets/thomas_prod.jpg")

st.image('assets/betterbilly.jpg', caption="anuncio")

pcol1, pcol2, pcol3, pcol4, pcol5, pcol6 = st.columns(6)

with pcol1:
    st.image('assets/casa.jpg')

with pcol2:
    st.text('''
    descrição foda do casa
    ''')

with pcol3:
    st.image('assets/nutello.jpg')

with pcol4:
    st.text('''
    cancer em nova embalagem!!!!    
    ''')

with pcol5:
    st.image('assets/uau.jpg')

with pcol6:
    st.text('uau')
