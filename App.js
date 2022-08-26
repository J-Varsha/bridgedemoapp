/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import {
  ScrollView,
  StyleSheet,
  Text,
  View,
  TouchableOpacity,
  NativeModules,
  TextInput,
  FlatList,
} from 'react-native';
import UserCardView from './src/CustomNativeModules/UserCardView';

const App = () => {
  const [users, setUsers] = React.useState(['John']);
  const [text, setText] = React.useState('');

  const addUser = () => {
    setUsers(users => [...users, text]);
    setText("");
  };

  return (
    <View style={styles.container}>
      <View style={{height: 500, borderWidth:1,width:'100%',marginBottom:20}}>
        <FlatList
          data={users}
          renderItem={({item}) => {
            console.log('render user', users);
            return (
              <UserCardView
                style={{width: '100%', height: 30, marginBottom: 20}}
                text={item}
                // user={15}
                // name={'Varsha'}
                // location={'Ghaziabad'}
              />
            );
          }}
        />
      </View>

      <TextInput
        style={styles.input}
        onChangeText={text => setText(text)}
        value={text}
      />
      <TouchableOpacity onPress={() => addUser()} style={styles.button}>
        <Text style={styles.btnTxt}>Add User</Text>
      </TouchableOpacity>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    paddingHorizontal: 16,
    justifyContent: 'center',
    alignItems: 'center',
  },
  button: {
    height: 30,
    backgroundColor: 'blue',
    borderRadius: 10,
    justifyContent: 'center',
    paddingHorizontal: 12,
  },
  btnTxt: {
    color: 'white',
    fontWeight: '700',
  },
  input: {
    borderWidth: 1,
    borderColor: '#D3D3D3',
    width: '100%',
    height: 35,
    borderRadius: 10,
    marginBottom: 20,
  },
});

export default App;
