import React, { useEffect, useState } from 'react';
import { View, Text, StyleSheet } from 'react-native';
import DeviceInfo from 'react-native-device-info';

const App = () => {
  const [charging, setCharging] = useState(false);

  useEffect(() => {
    const interval = setInterval(async () => {
      const state = await DeviceInfo.getPowerState();
      setCharging(state.batteryState === 'charging');
    }, 2000);
    return () => clearInterval(interval);
  }, []);

  return (
    <View style={styles.container}>
      <Text style={styles.text}>{charging ? 'Charging' : 'Not Charging'}</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', alignItems: 'center' },
  text: { fontSize: 20 }
});

export default App;
