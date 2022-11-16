import streamlit as st
import sqlite3

con = sqlite3.connect("data/sqlite.db")
cur = con.cursor()
res = cur.execute("select * from produtos")
nseimedeixa = res.fetchall()

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
    st.write("nome: " + nseimedeixa[0][1])
    st.write("grana: " + str(nseimedeixa[0][2]))

with pcol2:
    st.text('''
    descrição foda do casa
    ''')


with pcol3:
    st.image('assets/nutello.jpg')
    st.write("nome: " + nseimedeixa[1][1])
    st.write("grana: " + str(nseimedeixa[1][2]))

with pcol4:
    st.text('''
    cancer em nova embalagem!!!!    
    ''')

with pcol5:
    st.image('assets/uau.jpg')
    st.write("nome: " + nseimedeixa[2][1])
    st.write("grana: " + str(nseimedeixa[2][2]))

with pcol6:
    st.text('uau')



con.close()